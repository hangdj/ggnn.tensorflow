/**
 * Reads the entire file into a string using the specified charset.
 * @throw GdxRuntimeException if the file handle represents a directory, doesn't exist, or could not be read.
 */
public String readString(String charset) {
    if (preloader.isText(file))
        return preloader.texts.get(file);
    try {
        return new String(readBytes(), "UTF-8");
    } catch (UnsupportedEncodingException e) {
        return null;
    }
}
