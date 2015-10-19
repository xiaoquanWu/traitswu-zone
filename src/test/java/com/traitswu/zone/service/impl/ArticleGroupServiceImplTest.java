package com.traitswu.zone.service.impl;

import com.traitswu.zone.entity.ArticleGroup;
import com.traitswu.zone.service.ArticleGroupService;
import com.traitswu.zone.support.TestSupport;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by XiaoQuan on 2015/10/19.
 */
public class ArticleGroupServiceImplTest extends TestSupport {

    @Resource
    private ArticleGroupService articleGroupService;

    @Test
    public void testSave() throws Exception {
        ArticleGroup articleGroup = new ArticleGroup();
        articleGroup.setGroupName("G2");

        articleGroupService.save(articleGroup);

    }

    @Test
    public void testDelete() throws Exception {
        articleGroupService.delete("G2");
    }

    @Test
    public void testGet() throws Exception {

    }
}