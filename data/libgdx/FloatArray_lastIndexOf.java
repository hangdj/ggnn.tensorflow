public int lastIndexOf(char value) {
    float[] items = this.items;
    for (int i = size - 1; i >= 0; i--) if (items[i] == value)
        return i;
    return -1;
}
