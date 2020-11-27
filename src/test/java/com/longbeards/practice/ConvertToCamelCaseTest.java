package com.longbeards.practice;

import com.longbeards.practice.ConvertToCamelCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ConvertToCamelCaseTest {
    private static ConvertToCamelCase classUnderTest;

    @BeforeAll
    public static void setUp() {
        classUnderTest = new ConvertToCamelCase();
    }

    @Test
    public void testConvertToCamelCaseUnderscore() {
        String str = classUnderTest.convertToCamelCase_mapReduce("my_name_is_mukund");
        Assertions.assertEquals("myNameIsMukund", str);
    }

    @Test
    public void testConvertToCamelCase_Hyphen() {
        String str = classUnderTest.convertToCamelCase_mapReduce("my-name-is-mukund");
        Assertions.assertEquals("myNameIsMukund", str);
    }

    @Test
    public void testConvertToCamelCase_forEach_Underscore() {
        String str = classUnderTest.convertToCamelCase_forEach("my_name_is_mukund");
        Assertions.assertEquals( "myNameIsMukund", str);
    }

    @Test
    public void testConvertToCamelCase_forEach_hyphen() {
        String str = classUnderTest.convertToCamelCase_forEach("my-name-is-mukund");
        Assertions.assertEquals( "myNameIsMukund", str);
    }

}