package dynamic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PurposeCodeTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurposeCode#PurposeCode()}
     *   <li>{@link PurposeCode#setCodeDefinition(String)}
     *   <li>{@link PurposeCode#setCodeName(String)}
     *   <li>{@link PurposeCode#setCodeValue(String)}
     *   <li>{@link PurposeCode#toString()}
     *   <li>{@link PurposeCode#getCodeDefinition()}
     *   <li>{@link PurposeCode#getCodeName()}
     *   <li>{@link PurposeCode#getCodeValue()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        PurposeCode actualPurposeCode = new PurposeCode();
        actualPurposeCode.setCodeDefinition("Code Definition");
        actualPurposeCode.setCodeName("Code Name");
        actualPurposeCode.setCodeValue("42");
        String actualToStringResult = actualPurposeCode.toString();
        String actualCodeDefinition = actualPurposeCode.getCodeDefinition();
        String actualCodeName = actualPurposeCode.getCodeName();
        assertEquals("42", actualPurposeCode.getCodeValue());
        assertEquals("Code Definition", actualCodeDefinition);
        assertEquals("Code Name", actualCodeName);
        assertEquals("PurposeCode(codeValue=42, codeName=Code Name, codeDefinition=Code Definition)", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurposeCode#PurposeCode(String, String, String)}
     *   <li>{@link PurposeCode#setCodeDefinition(String)}
     *   <li>{@link PurposeCode#setCodeName(String)}
     *   <li>{@link PurposeCode#setCodeValue(String)}
     *   <li>{@link PurposeCode#toString()}
     *   <li>{@link PurposeCode#getCodeDefinition()}
     *   <li>{@link PurposeCode#getCodeName()}
     *   <li>{@link PurposeCode#getCodeValue()}
     * </ul>
     */
    @Test
    public void testConstructor2() {
        PurposeCode actualPurposeCode = new PurposeCode("42", "Code Name", "Code Definition");
        actualPurposeCode.setCodeDefinition("Code Definition");
        actualPurposeCode.setCodeName("Code Name");
        actualPurposeCode.setCodeValue("42");
        String actualToStringResult = actualPurposeCode.toString();
        String actualCodeDefinition = actualPurposeCode.getCodeDefinition();
        String actualCodeName = actualPurposeCode.getCodeName();
        assertEquals("42", actualPurposeCode.getCodeValue());
        assertEquals("Code Definition", actualCodeDefinition);
        assertEquals("Code Name", actualCodeName);
        assertEquals("PurposeCode(codeValue=42, codeName=Code Name, codeDefinition=Code Definition)", actualToStringResult);
    }

    /**
     * Method under test: {@link PurposeCode#equals(Object)}
     */
    @Test
    public void testEquals() {
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        assertNotEquals(buildResult, null);
    }

    /**
     * Method under test: {@link PurposeCode#equals(Object)}
     */
    @Test
    public void testEquals2() {
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        assertNotEquals(buildResult, "Different type to PurposeCode");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurposeCode#equals(Object)}
     *   <li>{@link PurposeCode#hashCode()}
     * </ul>
     */
    @Test
    public void testEquals3() {
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        assertEquals(buildResult, buildResult);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurposeCode#equals(Object)}
     *   <li>{@link PurposeCode#hashCode()}
     * </ul>
     */
    @Test
    public void testEquals4() {
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        PurposeCode buildResult2 = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Method under test: {@link PurposeCode#equals(Object)}
     */
    @Test
    public void testEquals5() {
        PurposeCode buildResult = PurposeCode.builder().codeDefinition("42").codeName("Code Name").codeValue("42").build();
        PurposeCode buildResult2 = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PurposeCode#equals(Object)}
     */
    @Test
    public void testEquals6() {
        PurposeCode buildResult = PurposeCode.builder().codeDefinition(null).codeName("Code Name").codeValue("42").build();
        PurposeCode buildResult2 = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PurposeCode#equals(Object)}
     */
    @Test
    public void testEquals7() {
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("42")
                .codeValue("42")
                .build();
        PurposeCode buildResult2 = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PurposeCode#equals(Object)}
     */
    @Test
    public void testEquals8() {
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName(null)
                .codeValue("42")
                .build();
        PurposeCode buildResult2 = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PurposeCode#equals(Object)}
     */
    @Test
    public void testEquals9() {
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("Code Name")
                .build();
        PurposeCode buildResult2 = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Method under test: {@link PurposeCode#equals(Object)}
     */
    @Test
    public void testEquals10() {
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue(null)
                .build();
        PurposeCode buildResult2 = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue("42")
                .build();
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurposeCode#equals(Object)}
     *   <li>{@link PurposeCode#hashCode()}
     * </ul>
     */
    @Test
    public void testEquals11() {
        PurposeCode buildResult = PurposeCode.builder().codeDefinition(null).codeName("Code Name").codeValue("42").build();
        PurposeCode buildResult2 = PurposeCode.builder().codeDefinition(null).codeName("Code Name").codeValue("42").build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurposeCode#equals(Object)}
     *   <li>{@link PurposeCode#hashCode()}
     * </ul>
     */
    @Test
    public void testEquals12() {
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName(null)
                .codeValue("42")
                .build();
        PurposeCode buildResult2 = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName(null)
                .codeValue("42")
                .build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurposeCode#equals(Object)}
     *   <li>{@link PurposeCode#hashCode()}
     * </ul>
     */
    @Test
    public void testEquals13() {
        PurposeCode buildResult = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue(null)
                .build();
        PurposeCode buildResult2 = PurposeCode.builder()
                .codeDefinition("Code Definition")
                .codeName("Code Name")
                .codeValue(null)
                .build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }
}
