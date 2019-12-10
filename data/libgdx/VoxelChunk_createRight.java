public static int createRight(Vector3 offset, int x, int y, int z, float[] vertices, int vertexOffset) {
    vertices[vertexOffset++] = offset.x + x + 1;
    vertices[vertexOffset++] = offset.y + y;
    vertices[vertexOffset++] = offset.z + z;
    vertices[vertexOffset++] = 1;
    vertices[vertexOffset++] = 0;
    vertices[vertexOffset++] = 0;
    vertices[vertexOffset++] = offset.x + x + 1;
    vertices[vertexOffset++] = offset.y + y;
    vertices[vertexOffset++] = offset.z + z + 1;
    vertices[vertexOffset++] = 1;
    vertices[vertexOffset++] = 0;
    vertices[vertexOffset++] = 0;
    vertices[vertexOffset++] = offset.x + x + 1;
    vertices[vertexOffset++] = offset.y + y + 1;
    vertices[vertexOffset++] = offset.z + z + 1;
    vertices[vertexOffset++] = 1;
    vertices[vertexOffset++] = 0;
    vertices[vertexOffset++] = 0;
    vertices[vertexOffset++] = offset.x + x + 1;
    vertices[vertexOffset++] = offset.y + y + 1;
    vertices[vertexOffset++] = offset.z + z;
    vertices[vertexOffset++] = 1;
    vertices[vertexOffset++] = 0;
    vertices[vertexOffset++] = 0;
    return vertexOffset;
}
