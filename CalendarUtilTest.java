public class CalendarUtilTest {

	// 待测对象
	private static CalendarUtil cutil = new CalendarUtil();

	// 测试isLeapYear方法
	public static void isLeapYearTest(int[] testcase) {
		System.out.println("开始测试isLeapYear方法：");
		boolean result;
		for (int i = 0; i < testcase.length; i++) {
			try {
				result = cutil.isLeapYear(testcase[i]);
				System.out.println("用例" + (i + 1) + "实际运行结果: " + result);
			} catch (Exception e) {
				System.out.println("用例" + (i + 1) + "实际运行结果: " + e.getMessage());
			}
		}
		System.out.println("isLeapYear方法测试完成！");
	}

	// 测试dateCheck方法
	public static void dateCheckTest(int[] testcase) {

	}

	// 测试getWeekday方法
	public static void getWeekdayTest(int[] testcase) {

	}

	// 测试dateInterval方法
	public static void dateIntervalTest(int[] testcase) {

	}

	public static void main(String[] args) {
		int[] tc1 = { 1000, 999, 0, -4, 3000, 3001, 3500, 1996, 1900, 2000, 2019 };
		isLeapYearTest(tc1);
	}
}
