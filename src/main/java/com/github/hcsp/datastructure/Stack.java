package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> stackList = new ArrayList<>();
    private int index = -1;

    public List<Integer> getStackList() {
        return stackList;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    // 将一个元素压入栈内
    public void push(int value) {
        this.getStackList().add(value);
        this.setIndex(this.getIndex() + 1);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int result = this.getStackList().remove(this.getIndex());
        this.setIndex(this.getIndex() - 1);
        return result;
    }
}
