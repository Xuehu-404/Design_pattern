package 迭代器模式;

public class TCLTelevision implements Television{
    private Object[] objects = {"少儿频道", "探索频道", "音乐之声", "电影频道", "购物频道"};

    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }

    private class TCLIterator implements TVIterator
    {
        private int currentIndex = 0;

        @Override
        public void setChannel(int i) {
            currentIndex = i;
        }

        @Override
        public void next() {
            if(currentIndex<objects.length)
            {
                currentIndex++;
            }
        }

        @Override
        public void previous() {
            if(currentIndex>0)
                currentIndex--;
        }

        @Override
        public boolean isLast() {
            return currentIndex==objects.length;
        }

        @Override
        public Object currentChannel() {
            return objects[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex==0;
        }
    }
}
