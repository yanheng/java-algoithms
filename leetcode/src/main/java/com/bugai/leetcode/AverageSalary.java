package com.bugai.leetcode;

public class AverageSalary {
    public double average(int[] salary) {
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        int total = 0;
        for (int i = 0; i < salary.length; i++) {
            maxSalary = Math.max(maxSalary, salary[i]);
            minSalary = Math.min(minSalary, salary[i]);
            total += salary[i];
        }
        return (total - maxSalary - minSalary) / (salary.length - 2);
    }
}
