package com.ozkuran.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by MahmutAli on 5/22/2016.
 */
public class EventTypeTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getId() throws Exception {
        EventType et = new EventType();
        et.setId(1);
        et.setName("Toplanti");
        assertEquals((Integer) 1,et.getId());
    }

    @Test
    public void setId() throws Exception {

    }

    @Test
    public void getName() throws Exception {

    }

    @Test
    public void setName() throws Exception {

    }

    @Test
    public void getEvents() throws Exception {

    }

    @Test
    public void setEvents() throws Exception {

    }

}