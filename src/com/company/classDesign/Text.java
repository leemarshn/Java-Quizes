package com.company.classDesign;

/**
 * @author - LeeN
 * PROJECT NAME: Java-Quiz-Yourself
 * CREATED ON: Sunday 19 September 2021 - 7:27 PM
 */
public interface Text {

    default String getContent() {
        return "Blank";
    }

    void setContent(String txt);

    void spellCheck() throws Exception;
}
