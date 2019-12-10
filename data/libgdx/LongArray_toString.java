public String toString(String separator) {
    if (size == 0)
        return "";
    long[] items = this.items;
    StringBuilder buffer = new StringBuilder(32);
    buffer.append(items[0]);
    for (int i = 1; i < size; i++) {
        buffer.append(separator);
        buffer.append(items[i]);
    }
    return buffer.toString();
}
