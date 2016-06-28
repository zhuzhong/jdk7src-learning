/**
 * 
 */
package z.java.util;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Arrays功能主要分如下几类： 1.折半查找 2.复制 3.比较 ４.填充 ５.排序
 * 
 * DualPivotQuicksort 快排
 * 
 * @author Administrator
 *
 */
public class ArraysTest {

	@Test
	public void fill() {
		int[] arrayInt = new int[] { 1, 7, 8, 2, 4 };
		Arrays.fill(arrayInt, 100); // 合部初始化为100
		print(arrayInt);

	}

	@Test
	public void sort() {
		int[] arrayInt = new int[] { 1, 7, 8, 2, 4 };
		Arrays.sort(arrayInt);  //小到一定程度，利用插入排序
		print(arrayInt);
	}

	/*
	 * 1、deepEquals用于判定两个指定数组彼此是否深层相等，此方法适用于任意深度的嵌套数组。
	 * 2、equals用于判定两个数组是否相等，如果两个数组以相同顺序包含相同元素，则返回true，否则返回false。
	 * 3、通过比对“代码一”和“代码二”我们可以得出这样一个结论：如果两个数组使用equals返回true，则使用deepEquals也返回true，
	 * 也就是说在比较的两个数组均为一维数组的前提下，equals和deepEquals的比较结果没有差别；
	 * 4、如果要比较多为数组，则需要使用deepEquals方法；
	 */
	@Test
	public void deepEquals() {
		String[][] name1 = { { "G", "a", "o" }, { "H", "u", "a", "n" },
				{ "j", "i", "e" } };
		String[][] name2 = { { "G", "a", "o" }, { "H", "u", "a", "n" },
				{ "j", "i", "e" } };
		System.out.println(Arrays.equals(name1, name2)); // false
		System.out.println(Arrays.deepEquals(name1, name2));// true

		String[] name3 = { "G", "a", "o", "H", "u", "a", "n", "j", "i", "e" };
		String[] name4 = { "G", "a", "o", "H", "u", "a", "n", "j", "i", "e" };
		System.out.println(Arrays.equals(name3, name4)); // true
		System.out.println(Arrays.deepEquals(name3, name4)); // true

	}

	@Test
	public void binarySearch() {
		int[] arrayInt = new int[] { 1, 7, 8, 2, 4 };
		int searched = 7;
		int index = Arrays.binarySearch(arrayInt, searched);
		Assert.assertEquals(1, index);
		System.out.println(index);
	}

	@Test
	public void copyOf() {
		int[] arrayInt = new int[] { 1, 7, 8, 2, 4 };
		int[] copy1 = Arrays.copyOf(arrayInt, 3);
		print(copy1);

		int[] copy2 = Arrays.copyOf(arrayInt, 7);
		print(copy2);
	}

	private void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "-");
		}
		System.out.println();
	}
}
