package com.bugai.leetcode;


public class TicketTime {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets[k];
        int times = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tickets.length; j++) {
                if (tickets[j] == 0) {
                    continue;
                } else {
                    times++;
                    tickets[j] = tickets[j] - 1;
                }
                if (tickets[k] == 0) {
                    return times;
                }
            }
        }
        return times;
    }

    public static void main(String[] args) {
        TicketTime ticketTime = new TicketTime();
        int[] tickets = {2, 1, 2, 2};
        int k = 2;

        int i = ticketTime.timeRequiredToBuy(tickets, k);
        System.out.println(String.valueOf(i));

        int[] tickets1 = {84, 49, 5, 24, 70, 77, 87, 8};
        int k1 = 3;

        int i1 = ticketTime.timeRequiredToBuy(tickets1, k1);
        System.out.println(i1);
    }
}
