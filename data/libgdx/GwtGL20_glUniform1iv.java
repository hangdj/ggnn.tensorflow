@Override
public void glUniform1iv(int location, int count, int[] v, int offset) {
    WebGLUniformLocation loc = getUniformLocation(location);
    gl.uniform1iv(loc, v);
}
