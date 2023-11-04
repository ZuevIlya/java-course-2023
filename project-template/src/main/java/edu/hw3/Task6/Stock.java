package edu.hw3.Task6;

import java.util.PriorityQueue;

class Stock implements StockMarket {
    static PriorityQueue<Stock> queue = new PriorityQueue<>();


    private Stock() {

    }

    @Override
    public void add(Stock stock) {
        queue.add(stock);
    }

    @Override
    public void remove(Stock stock) {
        queue.remove(stock);

    }

    @Override
    public Stock getMostValuableStock() {
        return queue.poll();
    }
}
