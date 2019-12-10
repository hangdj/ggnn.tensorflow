public void set(int index, short value) {
    if (index >= size)
        throw new IndexOutOfBoundsException("index can't be >= size: " + index + " >= " + size);
    items[index] = value;
}
