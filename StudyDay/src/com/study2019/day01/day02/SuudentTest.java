package com.study2019.day01.day02;

/**
 * @author 梁世龙
 * @create 2019-05-13 14:49
 */
public class SuudentTest {
    public static void main(String[] args) {
        //新建20个学生对象
        Student[] students = new Student[20];
        for (int i = 0;i<students.length;i++){
            students[i] = new Student();
            students[i].setNumber(i+1);
            students[i].setState((int) (Math.random()*(6-1+1)+1));
            students[i].setScore((int) (Math.random()*(100-0+1)));
        }

        SuudentTest suudentTest = new SuudentTest();
        suudentTest.print(students);
        System.out.println("*************");
        suudentTest.serchArray(students,3);
        System.out.println("*************");
        suudentTest.buboArray(students);
        suudentTest.print(students);

    }

    public void print(Student[] students){
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].toString());
        }
    }

    public void serchArray(Student[] students,int ss){
        for(int i=0;i<students.length;i++){
            if(students[i].getState()==ss){
                System.out.println(students[i].toString());
            }
        }
    }

    public void buboArray(Student[] students){
        //冒泡排序
        for(int i = 0;i<students.length-1;i++){
            for(int j = 0;j<students.length-1;j++){
                if(students[j].getScore()>students[j + 1].getScore()){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
}
