/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger.evaluate;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("idea")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("../completion/testData/handlers/runtimeCast")
public class CodeFragmentCompletionHandlerTestGenerated extends AbstractCodeFragmentCompletionHandlerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("CastPrivateFun.kt")
    public void testCastPrivateFun() throws Exception {
        runTest("../completion/testData/handlers/runtimeCast/CastPrivateFun.kt");
    }

    @TestMetadata("CastPropertyWithSmartCast.kt")
    public void testCastPropertyWithSmartCast() throws Exception {
        runTest("../completion/testData/handlers/runtimeCast/CastPropertyWithSmartCast.kt");
    }

    @TestMetadata("InsertExtFunction.kt")
    public void testInsertExtFunction() throws Exception {
        runTest("../completion/testData/handlers/runtimeCast/InsertExtFunction.kt");
    }

    @TestMetadata("InsertFunction.kt")
    public void testInsertFunction() throws Exception {
        runTest("../completion/testData/handlers/runtimeCast/InsertFunction.kt");
    }

    @TestMetadata("InsertImport.kt")
    public void testInsertImport() throws Exception {
        runTest("../completion/testData/handlers/runtimeCast/InsertImport.kt");
    }

    @TestMetadata("NotImportedExtension.kt")
    public void testNotImportedExtension() throws Exception {
        runTest("../completion/testData/handlers/runtimeCast/NotImportedExtension.kt");
    }
}
