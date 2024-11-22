import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L2022113562_10_Test {

    // 测试用例设计总体原则：
    // 1. 等价类划分原则：
    //    - 将输入的表示分数加减运算的字符串按照不同的情况进行划分。例如，根据表达式结果是否为整数、表达式中分数的正负情况、表达式中分数的个数等因素进行划分。
    //    - 对于每个划分出的等价类，选取具有代表性的测试用例进行测试，以覆盖各种可能出现的情况，确保程序在不同输入场景下都能正确运行。
    // 2. 边界值分析原则：
    //    - 考虑输入分数的分子与分母的边界值情况，如分子分母取值范围的最小值1和最大值10。在测试用例中包含这些边界值的组合，检查程序在边界条件下的正确性。
    // 3. 同时检查不合法的表达式的输入：
    //    - 如连续两个除号和两个分数之间没有加减号

    // 测试方法：testFractionAdditionExample1
    // 测试目的：验证当输入为简单的两个分数相加且结果为0的表达式（如"-1/2+1/2"）时，程序能正确返回最简分数形式的结果（即"0/1"）。
    // 用到的测试用例：expression = "-1/2+1/2"，预期结果expectedResult = "0/1"
    @Test
    public void testFractionAdditionExample1() {
        Solution10 solution = new Solution10();
        String expression = "-1/2+1/2";
        String expectedResult = "0/1";
        String actualResult = solution.fractionAddition(expression);
        assertEquals(expectedResult, actualResult);
    }

    // 测试方法：testFractionAdditionExample2
    // 测试目的：验证当输入为多个分数相加且结果为非整数分数的表达式（如"-1/2+1/2+1/3"）时，程序能正确返回最简分数形式的结果（即"1/3"）。
    // 用到的测试用例：expression = "-1/2+1/2+1/3"，预期结果expectedResult = "1/3"
    @Test
    public void testFractionAdditionExample2() {
        Solution10 solution = new Solution10();
        String expression = "-1/2+1/2+1/3";
        String expectedResult = "1/3";
        String actualResult = solution.fractionAddition(expression);
        assertEquals(expectedResult, actualResult);
    }

    // 测试方法：testFractionAdditionExample3
    // 测试目的：验证当输入为两个分数相减且结果为负数分数的表达式（如"1/3-1/2"）时，程序能正确返回最简分数形式的结果（即"-1/6"）。
    // 用到的测试用例：expression = "1/3-1/2"，预期结果expectedResult = "-1/6"
    @Test
    public void testFractionAdditionExample3() {
        Solution10 solution = new Solution10();
        String expression = "1/3-1/2";
        String expectedResult = "-1/6";
        String actualResult = solution.fractionAddition(expression);
        assertEquals(expectedResult, actualResult);
    }

    // 测试方法：testFractionAdditionExample4
    // 测试目的：验证当输入为两个分数相减且结果为负数分数，且表达式开头有正号的情况（如"+1/3-1/2"）时，程序能正确返回最简分数形式的结果（即"-1/6"）。
    // 用到的测试用例：expression = "+1/3-1/2"，预期结果expectedResult = "-1/6"
    @Test
    public void testFractionAdditionExample4() {
        Solution10 solution = new Solution10();
        String expression = "+1/3-1/2";
        String expectedResult = "-1/6";
        String actualResult = solution.fractionAddition(expression);
        assertEquals(expectedResult, actualResult);
    }

    // 测试方法：testFractionAdditionExample5
    // 测试目的：验证当输入为多个分数相减且结果为非整数分数的表达式（如"10/3-10/7-3/7"）时，程序能正确返回最简分数形式的结果（即"31/21"）。
    // 用到的测试用例：expression = "10/3-10/7-3/7"，预期结果expectedResult = "31/21"
    @Test
    public void testFractionAdditionExample5() {
        Solution10 solution = new Solution10();
        String expression = "10/3-10/7-3/7";
        String expectedResult = "31/21";
        String actualResult = solution.fractionAddition(expression);
        assertEquals(expectedResult, actualResult);
    }

    // 测试方法：testFractionAdditionExample6
    // 测试目的：验证当输入为格式错误的表达式，即除号后未紧跟分母（如"1//7"）时，程序能正确返回相应的错误提示信息（即"输入表达式的格式不正确，除号后应该跟着分母！"）。
    // 用到的测试用例：expression = "1//7"，预期结果expectedResult = "输入表达式的格式不正确，除号后应该跟着分母！"
    @Test
    public void testFractionAdditionExample6() {
        Solution10 solution = new Solution10();
        String expression = "1//7";
        String expectedResult = "输入表达式的格式不正确，除号后应该跟着分母！";
        String actualResult = solution.fractionAddition(expression);
        assertEquals(expectedResult, actualResult);
    }

    // 测试方法：testFractionAdditionExample7
    // 测试目的：验证当输入为会导致分子计算结果为0的错误表达式（如"1/21/7"）时，程序能正确返回相应的错误提示信息（即"表达式的分子不能为0！"）。
    // 用到的测试用例：expression = "1/21/7"，预期结果expectedResult = "表达式的分子不能为0！"
    @Test
    public void testFractionAdditionExample7() {
        Solution10 solution = new Solution10();
        String expression = "1/21/7";
        String expectedResult = "表达式的分子不能为0！";
        String actualResult = solution.fractionAddition(expression);
        assertEquals(expectedResult, actualResult);
    }
}