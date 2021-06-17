using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CourseOutput{
    class Program
    {
        public static void Main(string[] args)
        {
            string course = "C#";
            Console.WriteLine(course);
            Console.WriteLine("我的课程名称是:"+course);//用+号输出
            Console.WriteLine("我的课程名称是:{0}",course);//用占位符输出
        }
    }
}