@Override
public void setVertices(float[] vertices, int offset, int count) {
    isDirty = true;
    BufferUtils.copy(vertices, buffer, count, offset);
    buffer.position(0);
    buffer.limit(count);
    bufferChanged();
}
