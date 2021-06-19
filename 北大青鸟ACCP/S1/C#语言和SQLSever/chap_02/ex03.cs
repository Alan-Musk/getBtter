using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ArrayInit{
    class Program
    {
        public static void Main(string[] args)
        {
            int[] array = new int[5] { 0, 1, 2, 3, 4 };
            //创建一个含有五个整数数组的数组
            int[] arr1 = new int[] { 0, 1, 2, 3, 4 };//省略数组长度
            int[] arr2 = { 0, 1, 2, 3, 4 };//省略new关键字
            Console.WriteLine("数组array的元素个数是{0}",array.Length);
            Console.WriteLine("数组arr1的元素个数是{0}", arr1.Length);
            Console.WriteLine("数组arr2的元素个数是{0}", arr2.Length);

        }
    }
}