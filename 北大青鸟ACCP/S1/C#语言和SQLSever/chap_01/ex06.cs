using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MySchool{
    public class Student {
        //姓名
        public string name;
        //年龄
        public int age;
        //输出学员信息
        public void Show()
        {
            Console.WriteLine("学员姓名:{0},年龄:{1}",name,age);
        }
    }
    class Program
    {
        public static void Main(string[] args)
        {
            //初始化Student类
            Student stu = new Student();
            Console.WriteLine("请输入姓名:");
            stu.name = Console.ReadLine();
            Console.WriteLine("请输入年龄");
            stu.age = int.Parse(Console.ReadLine());
            stu.Show();
        }
    }
}