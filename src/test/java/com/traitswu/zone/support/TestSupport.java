package com.traitswu.zone.support;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by XiaoQuan on 2015/10/16.
 */


@ContextConfiguration({"classpath:application-beans.xml", "classpath:application-datasource.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional("txManager")
//@Rollback(false)
public abstract class TestSupport extends AbstractJUnit4SpringContextTests {

   /* @BeforeTransaction
    public void verifyInitialDatabaseState() {
        // logic to verify the initial state before a transaction is started
        System.out.println("verifyInitialDatabaseState");
    }

    @Before
    public void setUpTestDataWithinTransaction() {
        // set up test data within the transaction
        System.out.println("setUpTestDataWithinTransaction");

    }

    @Test
    // overrides the class-level defaultRollback setting
    public void modifyDatabaseWithinTransaction() {
        // logic which uses the test data and modifies database state
        System.out.println("modifyDatabaseWithinTransaction");

    }

    @After
    public void tearDownWithinTransaction() {
        // execute "tear down" logic within the transaction
        System.out.println("tearDownWithinTransaction");

    }

    @AfterTransaction
    public void verifyFinalDatabaseState() {
        // logic to verify the final state after transaction has rolled back
        System.out.println("verifyFinalDatabaseState");

    }*/
}



