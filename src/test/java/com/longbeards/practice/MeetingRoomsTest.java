package com.longbeards.practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeetingRoomsTest {

    private static MeetingRooms classUnderTest;

    @BeforeAll
    public static void setUp() {
        classUnderTest = new MeetingRooms();
    }

    @Test
    public void testCanAttendMeetings() {
        int[][] intervals = {{7, 10}, {2, 4}};
        assertTrue(classUnderTest.canAttendMeetings(intervals));
        intervals = new int[][]{{0, 30}, {5, 10}, {15, 20}};
        assertFalse(classUnderTest.canAttendMeetings(intervals));
    }

}