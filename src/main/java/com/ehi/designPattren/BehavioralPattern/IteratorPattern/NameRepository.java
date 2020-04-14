package com.ehi.designPattren.BehavioralPattern.IteratorPattern;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:59
 * @Description: TODO
 */
public class NameRepository implements Container {

    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
