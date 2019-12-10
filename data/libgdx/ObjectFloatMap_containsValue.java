/**
 * Returns true if the specified value is in the map. Note this traverses the entire map and compares every value, which may be
 * an expensive operation.
 */
public boolean containsValue(float value) {
    K[] keyTable = this.keyTable;
    float[] valueTable = this.valueTable;
    for (int i = capacity + stashSize; i-- > 0; ) if (keyTable[i] != null && valueTable[i] == value)
        return true;
    return false;
}
