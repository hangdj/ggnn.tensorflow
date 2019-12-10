public final LongBuffer get(long[] dest, int off, int len) {
    int length = dest.length;
    if (off < 0 || len < 0 || (long) len + (long) off > length) {
        throw new IndexOutOfBoundsException();
    }
    if (len > remaining()) {
        throw new BufferUnderflowException();
    }
    System.arraycopy(backingArray, offset + position, dest, off, len);
    position += len;
    return this;
}
