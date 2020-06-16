package com.fan.util;

/**
 * @author fanwenqian
 */
public class Page {
    // 开始数据
    int start;
    // 每一页的数量
    int count;
    // 总共的数据量
    int total;

    public Page(int start, int count) {
        super();
        this.start = start;
        this.count = count;
    }

    public boolean isHasPreviouse(){
        return start != 0;

    }
    public boolean isHasNext(){
        return start != getLast();
    }

    public int getTotalPage(){
        int totalPage;
        // 假设总数是50，是能够被5整除的，那么就有10页
        if (0 == total % count){
            totalPage = total /count;
        }
        // 假设总数是51，不能够被5整除的，那么就有11页
        else {
            totalPage = total / count + 1;
        }
        if(0==totalPage){
            totalPage = 1;
        }
        return totalPage;
    }

    public int getLast(){
        int last;
        // 假设总数是50，是能够被5整除的，那么最后一页的开始就是40
        if (0 == total % count) {
            last = total - count;
        }
        // 假设总数是51，不能够被5整除的，那么最后一页的开始就是50
        else {
            last = total - total % count;
        }
        last = Math.max(last, 0);
        return last;
    }

    // 各种 setter 和 getter

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
