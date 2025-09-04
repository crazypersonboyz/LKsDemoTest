package dynamic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PurposeCodePropertiesTest {
    /**
     * Method under test: {@link PurposeCodeProperties#canEqual(Object)}
     */
    @Test
    public void testCanEqual() {
        assertFalse((new PurposeCodeProperties()).canEqual("Other"));
    }

    /**
     * Method under test: {@link PurposeCodeProperties#canEqual(Object)}
     */
    @Test
    public void testCanEqual2() {
        PurposeCodeProperties purposeCodeProperties = new PurposeCodeProperties();
        purposeCodeProperties.setPurposeCode(new ArrayList<PurposeCode>());

        PurposeCodeProperties purposeCodeProperties2 = new PurposeCodeProperties();
        purposeCodeProperties2.setPurposeCode(new ArrayList<PurposeCode>());
        assertTrue(purposeCodeProperties.canEqual(purposeCodeProperties2));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link PurposeCodeProperties}
     *   <li>{@link PurposeCodeProperties#setPurposeCode(List)}
     *   <li>{@link PurposeCodeProperties#toString()}
     *   <li>{@link PurposeCodeProperties#getPurposeCode()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        PurposeCodeProperties actualPurposeCodeProperties = new PurposeCodeProperties();
        ArrayList<PurposeCode> purposeCode = new ArrayList<>();
        actualPurposeCodeProperties.setPurposeCode(purposeCode);
        String actualToStringResult = actualPurposeCodeProperties.toString();
        assertEquals("PurposeCodeProperties(purposeCode=[])", actualToStringResult);
        assertSame(purposeCode, actualPurposeCodeProperties.getPurposeCode());
    }

    /**
     * Method under test: {@link PurposeCodeProperties#equals(Object)}
     */
    @Test
    public void testEquals() {
        PurposeCodeProperties purposeCodeProperties = new PurposeCodeProperties();
        purposeCodeProperties.setPurposeCode(new ArrayList<PurposeCode>());
        assertNotEquals(purposeCodeProperties, null);
    }

    /**
     * Method under test: {@link PurposeCodeProperties#equals(Object)}
     */
    @Test
    public void testEquals2() {
        PurposeCodeProperties purposeCodeProperties = new PurposeCodeProperties();
        purposeCodeProperties.setPurposeCode(new ArrayList<PurposeCode>());
        assertNotEquals(purposeCodeProperties, "Different type to PurposeCodeProperties");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurposeCodeProperties#equals(Object)}
     *   <li>{@link PurposeCodeProperties#hashCode()}
     * </ul>
     */
    @Test
    public void testEquals3() {
        PurposeCodeProperties purposeCodeProperties = new PurposeCodeProperties();
        purposeCodeProperties.setPurposeCode(new ArrayList<PurposeCode>());
        assertEquals(purposeCodeProperties, purposeCodeProperties);
        int expectedHashCodeResult = purposeCodeProperties.hashCode();
        assertEquals(expectedHashCodeResult, purposeCodeProperties.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurposeCodeProperties#equals(Object)}
     *   <li>{@link PurposeCodeProperties#hashCode()}
     * </ul>
     */
    @Test
    public void testEquals4() {
        PurposeCodeProperties purposeCodeProperties = new PurposeCodeProperties();
        purposeCodeProperties.setPurposeCode(new ArrayList<PurposeCode>());

        PurposeCodeProperties purposeCodeProperties2 = new PurposeCodeProperties();
        purposeCodeProperties2.setPurposeCode(new ArrayList<PurposeCode>());
        assertEquals(purposeCodeProperties, purposeCodeProperties2);
        int expectedHashCodeResult = purposeCodeProperties.hashCode();
        assertEquals(expectedHashCodeResult, purposeCodeProperties2.hashCode());
    }

    /**
     * Method under test: {@link PurposeCodeProperties#equals(Object)}
     */
    @Test
    public void testEquals5() {
        ArrayList<PurposeCode> purposeCode = new ArrayList<>();
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        purposeCode.add(buildResult);

        PurposeCodeProperties purposeCodeProperties = new PurposeCodeProperties();
        purposeCodeProperties.setPurposeCode(purposeCode);

        PurposeCodeProperties purposeCodeProperties2 = new PurposeCodeProperties();
        purposeCodeProperties2.setPurposeCode(new ArrayList<PurposeCode>());
        assertNotEquals(purposeCodeProperties, purposeCodeProperties2);
    }
}
