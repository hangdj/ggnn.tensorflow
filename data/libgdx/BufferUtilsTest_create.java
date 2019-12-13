@Override
public void create() {
    // Not emulated in gwt
    // ByteBuffer bytebuffer = BufferUtils.newUnsafeByteBuffer(1000 * 1000);
    // BufferUtils.disposeUnsafeByteBuffer(bytebuffer);
    ByteBuffer bb = BufferUtils.newByteBuffer(8);
    CharBuffer cb = BufferUtils.newCharBuffer(8);
    ShortBuffer sb = BufferUtils.newShortBuffer(8);
    IntBuffer ib = BufferUtils.newIntBuffer(8);
    LongBuffer lb = BufferUtils.newLongBuffer(8);
    FloatBuffer fb = BufferUtils.newFloatBuffer(8);
    DoubleBuffer db = BufferUtils.newDoubleBuffer(8);
    bb.position(4);
    BufferUtils.copy(new byte[] { 1, 2, 3, 4 }, 0, bb, 4);
    checkInt(bb.get(), 1);
    checkInt(bb.get(), 2);
    checkInt(bb.get(), 3);
    checkInt(bb.get(), 4);
    cb.position(4);
    BufferUtils.copy(new char[] { 1, 2, 3, 4 }, 0, cb, 4);
    checkInt(cb.get(), 1);
    checkInt(cb.get(), 2);
    checkInt(cb.get(), 3);
    checkInt(cb.get(), 4);
    cb.position(0);
    BufferUtils.copy(new char[] { 5, 6, 7, 8 }, 1, cb, 3);
    checkInt(cb.get(), 6);
    checkInt(cb.get(), 7);
    checkInt(cb.get(), 8);
    sb.position(4);
    BufferUtils.copy(new short[] { 1, 2, 3, 4 }, 0, sb, 4);
    checkInt(sb.get(), 1);
    checkInt(sb.get(), 2);
    checkInt(sb.get(), 3);
    checkInt(sb.get(), 4);
    sb.position(0);
    BufferUtils.copy(new short[] { 5, 6, 7, 8 }, 1, sb, 3);
    checkInt(sb.get(), 6);
    checkInt(sb.get(), 7);
    checkInt(sb.get(), 8);
    ib.position(4);
    BufferUtils.copy(new int[] { 1, 2, 3, 4 }, 0, ib, 4);
    checkInt(ib.get(), 1);
    checkInt(ib.get(), 2);
    checkInt(ib.get(), 3);
    checkInt(ib.get(), 4);
    ib.position(0);
    BufferUtils.copy(new int[] { 5, 6, 7, 8 }, 1, ib, 3);
    checkInt(ib.get(), 6);
    checkInt(ib.get(), 7);
    checkInt(ib.get(), 8);
    lb.position(4);
    BufferUtils.copy(new long[] { 1, 2, 3, 4 }, 0, lb, 4);
    checkInt(lb.get(), 1);
    checkInt(lb.get(), 2);
    checkInt(lb.get(), 3);
    checkInt(lb.get(), 4);
    lb.position(0);
    BufferUtils.copy(new long[] { 5, 6, 7, 8 }, 1, lb, 3);
    checkInt(lb.get(), 6);
    checkInt(lb.get(), 7);
    checkInt(lb.get(), 8);
    fb.position(4);
    BufferUtils.copy(new float[] { 1, 2, 3, 4 }, 0, fb, 4);
    checkFloat(fb.get(), 1);
    checkFloat(fb.get(), 2);
    checkFloat(fb.get(), 3);
    checkFloat(fb.get(), 4);
    fb.position(0);
    BufferUtils.copy(new float[] { 5, 6, 7, 8 }, 1, fb, 3);
    checkFloat(fb.get(), 6);
    checkFloat(fb.get(), 7);
    checkFloat(fb.get(), 8);
    if (Gdx.app.getType() != ApplicationType.WebGL) {
        // gwt throws: NYI: Numbers.doubleToRawLongBits
        db.position(4);
        BufferUtils.copy(new double[] { 1, 2, 3, 4 }, 0, db, 4);
        checkFloat(db.get(), 1);
        checkFloat(db.get(), 2);
        checkFloat(db.get(), 3);
        checkFloat(db.get(), 4);
        db.position(0);
        BufferUtils.copy(new double[] { 5, 6, 7, 8 }, 1, db, 3);
        checkFloat(db.get(), 6);
        checkFloat(db.get(), 7);
        checkFloat(db.get(), 8);
    }
    ByteBuffer bb2 = BufferUtils.newByteBuffer(4);
    bb.position(4);
    BufferUtils.copy(bb, bb2, 4);
    checkInt(bb2.get(), 1);
    checkInt(bb2.get(), 2);
    checkInt(bb2.get(), 3);
    checkInt(bb2.get(), 4);
    bench();
}