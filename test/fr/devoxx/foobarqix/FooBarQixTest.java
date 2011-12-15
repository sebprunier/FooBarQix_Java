package fr.devoxx.foobarqix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for FooBarQix.<br/>
 * Used for regression tests if FooBarQix.java code is changed.
 * 
 * @author sebastien.prunier
 * 
 */
public class FooBarQixTest {

    @Test
    public void testExecute() {
        String[] result = new FooBarQix().execute(100);
        assertEquals("1", result[0]);
        assertEquals("2", result[1]);
        assertEquals("FooFoo", result[2]);
        assertEquals("4", result[3]);
        assertEquals("BarBar", result[4]);
        assertEquals("Foo", result[5]);
        assertEquals("QixQix", result[6]);
        assertEquals("8", result[7]);
        assertEquals("Foo", result[8]);
        assertEquals("Bar", result[9]);
        assertEquals("11", result[10]);
        assertEquals("Foo", result[11]);
        assertEquals("Foo", result[12]);
        assertEquals("Qix", result[13]);
        assertEquals("FooBarBar", result[14]);
        assertEquals("16", result[15]);
        assertEquals("Qix", result[16]);
        assertEquals("Foo", result[17]);
        assertEquals("19", result[18]);
        assertEquals("Bar", result[19]);
        assertEquals("FooQix", result[20]);
        assertEquals("22", result[21]);
        assertEquals("Foo", result[22]);
        assertEquals("Foo", result[23]);
        assertEquals("BarBar", result[24]);
        assertEquals("26", result[25]);
        assertEquals("FooQix", result[26]);
        assertEquals("Qix", result[27]);
        assertEquals("29", result[28]);
        assertEquals("FooBarFoo", result[29]);
        assertEquals("Foo", result[30]);
        assertEquals("Foo", result[31]);
        assertEquals("FooFooFoo", result[32]);
        assertEquals("Foo", result[33]);
        assertEquals("BarQixFooBar", result[34]);
        assertEquals("FooFoo", result[35]);
        assertEquals("FooQix", result[36]);
        assertEquals("Foo", result[37]);
        assertEquals("FooFoo", result[38]);
        assertEquals("Bar", result[39]);
        assertEquals("41", result[40]);
        assertEquals("FooQix", result[41]);
        assertEquals("Foo", result[42]);
        assertEquals("44", result[43]);
        assertEquals("FooBarBar", result[44]);
        assertEquals("46", result[45]);
        assertEquals("Qix", result[46]);
        assertEquals("Foo", result[47]);
        assertEquals("Qix", result[48]);
        assertEquals("BarBar", result[49]);
        assertEquals("FooBar", result[50]);
        assertEquals("Bar", result[51]);
        assertEquals("BarFoo", result[52]);
        assertEquals("FooBar", result[53]);
        assertEquals("BarBarBar", result[54]);
        assertEquals("QixBar", result[55]);
        assertEquals("FooBarQix", result[56]);
        assertEquals("Bar", result[57]);
        assertEquals("Bar", result[58]);
        assertEquals("FooBar", result[59]);
        assertEquals("61", result[60]);
        assertEquals("62", result[61]);
        assertEquals("FooQixFoo", result[62]);
        assertEquals("64", result[63]);
        assertEquals("BarBar", result[64]);
        assertEquals("Foo", result[65]);
        assertEquals("Qix", result[66]);
        assertEquals("68", result[67]);
        assertEquals("Foo", result[68]);
        assertEquals("BarQixQix", result[69]);
        assertEquals("Qix", result[70]);
        assertEquals("FooQix", result[71]);
        assertEquals("QixFoo", result[72]);
        assertEquals("Qix", result[73]);
        assertEquals("FooBarQixBar", result[74]);
        assertEquals("Qix", result[75]);
        assertEquals("QixQixQix", result[76]);
        assertEquals("FooQix", result[77]);
        assertEquals("Qix", result[78]);
        assertEquals("Bar", result[79]);
        assertEquals("Foo", result[80]);
        assertEquals("82", result[81]);
        assertEquals("Foo", result[82]);
        assertEquals("FooQix", result[83]);
        assertEquals("BarBar", result[84]);
        assertEquals("86", result[85]);
        assertEquals("FooQix", result[86]);
        assertEquals("88", result[87]);
        assertEquals("89", result[88]);
        assertEquals("FooBar", result[89]);
        assertEquals("Qix", result[90]);
        assertEquals("92", result[91]);
        assertEquals("FooFoo", result[92]);
        assertEquals("94", result[93]);
        assertEquals("BarBar", result[94]);
        assertEquals("Foo", result[95]);
        assertEquals("Qix", result[96]);
        assertEquals("Qix", result[97]);
        assertEquals("Foo", result[98]);
        assertEquals("Bar", result[99]);
    }

}
