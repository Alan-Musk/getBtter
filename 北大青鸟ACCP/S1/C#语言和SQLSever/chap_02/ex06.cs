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
            //循环中将array的每个元素赋值给item
            Console.WriteLine("数组array中{0}的元素的值是:",array.Length);
            foreach (int item in array)
            {
                Console.WriteLine(item+"");
            }
            Console.WriteLine("");
            Console.ReadLine();
        }
    }
}