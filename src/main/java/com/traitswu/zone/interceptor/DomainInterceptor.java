package com.traitswu.zone.interceptor;

import com.traitswu.zone.entity.Domain;
import org.hibernate.EmptyInterceptor;
import org.hibernate.Interceptor;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by XiaoQuan on 2015/10/21.
 */
public class DomainInterceptor extends EmptyInterceptor {
    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        if (entity instanceof Domain) {
//            Domain domain = (Domain) entity;
            boolean isModified = false;
            for (int i = 0; i < propertyNames.length; i++) {
                if ("createDate".equals(propertyNames[i]) || "modifiedDate".equals(propertyNames[i])) {
                    state[i] = new Date();
                    isModified = true;
                }
            }
            return isModified;
        }
        return false;
    }

    @Override
    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, Type[] types) {
        if (entity instanceof Domain) {
            boolean isModified = false;
            for (int i = 0; i < propertyNames.length; i++) {
                if ("modifiedDate".equals(propertyNames[i])) {
                    currentState[i] = new Date();
                    isModified = true;
                }
            }
            return isModified;
        }
        return false;
    }
}
