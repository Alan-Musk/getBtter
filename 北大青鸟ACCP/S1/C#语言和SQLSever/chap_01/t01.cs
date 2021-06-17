using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace test{
    class test_01
    {
        public static void Main(string[] args)
        {
            string name;//昵称
            int num;//等级

            Console.WriteLine("请输入昵称");
            name = Console.ReadLine();

            Console.WriteLine("请输入QQ等级");
            num = int.Parse(Console.ReadLine());

            Console.WriteLine("使用加号连接输出:");
            Console.WriteLine(name+"您好!您的等级是:"+num);
            Console.WriteLine("使用格式字符串输出");
            Console.WriteLine("{0}您好,您的等级是:{1}",name,num);
        }
    }
}