package com.github.redfoos.logstash.parser;

import com.github.redfoos.logstash.LogstashPareserDefinition;
import com.intellij.testFramework.ParsingTestCase;

public class LogstashParserTest extends ParsingTestCase {
    public LogstashParserTest() {
        super("", "conf", new LogstashPareserDefinition());
    }

    @Override
    protected String getTestDataPath() {
        return "testData/parser";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }

    public void testEmptyPluginBlock() {
        doTest(true);
    }

    public void testPluginBlock() {
        doTest(true);
    }

    public void testConditions() {
        doTest(true);
    }

    public void testDataTypes() {
        doTest(true);
    }

    public void testComplexConfig() {
        doTest(true);
    }

}