package Ch18_FileHandling.FileWriter;

public class Notes {


    /*
     * ==================== FILE WRITER IN JAVA ====================
     *
     * FileWriter is used to write character data into a file.
     *
     * Package:
     * import java.io.FileWriter;
     *
     * ==================== CONSTRUCTORS ============================
     *
     * 1. FileWriter(String fileName)
     *    -> Creates a FileWriter for the given file.
     *    -> Existing file content gets overwritten.
     *
     * 2. FileWriter(String fileName, boolean append)
     *    -> append = true  : Adds content at the end of file.
     *    -> append = false : Overwrites existing content.
     *
     * 3. FileWriter(File file)
     *    -> Creates FileWriter using File object.
     *
     * 4. FileWriter(File file, boolean append)
     *    -> Creates FileWriter using File object with append option.
     *
     * ==================== IMPORTANT METHODS =======================
     *
     * 1. write(int c)
     *    -> Writes a single character.
     *
     * 2. write(String str)
     *    -> Writes a complete String into the file.
     *
     * 3. write(char[] c)
     *    -> Writes a character array into the file.
     *
     * 4. write(char[] c, int off, int len)
     *    -> Writes characters from a specified offset and length.
     *
     * 5. append(char c)
     *    -> Appends a single character.
     *
     * 6. append(CharSequence csq)
     *    -> Appends a character sequence (String, etc.).
     *
     * 7. flush()
     *    -> Forces buffered data to be written to the file.
     *
     * 8. close()
     *    -> Closes the FileWriter.
     *    -> Releases associated resources.
     *
     * ==================== IMPORTANT POINTS ========================
     *
     * 1. FileWriter writes character/text data.
     * 2. FileWriter automatically creates a file if it does not exist.
     * 3. Default constructor behavior overwrites existing content.
     * 4. Use append = true to preserve old content.
     * 5. FileWriter can throw IOException.
     * 6. Always close FileWriter after use.
     * 7. try-with-resources automatically closes FileWriter.
     *
     * ==============================================================
     */



    /*
     * ==================== FILE WRITER IN JAVA ====================
     *
     * FileWriter का उपयोग किसी File में Character या Text Data
     * लिखने (Write) के लिए किया जाता है।
     *
     * Package:
     * import java.io.FileWriter;
     *
     * ==================== CONSTRUCTORS ============================
     *
     * 1. FileWriter(String fileName)
     *    -> दिए गए नाम की File के लिए FileWriter बनाता है।
     *    -> अगर File पहले से मौजूद है, तो उसका पुराना Content
     *       Overwrite (मिटाकर नया लिखना) हो जाता है।
     *
     * 2. FileWriter(String fileName, boolean append)
     *    -> append = true  : पुराने Content के अंत में नया Content जोड़ता है।
     *    -> append = false : पुराने Content को Overwrite करता है।
     *
     * 3. FileWriter(File file)
     *    -> File Object का उपयोग करके FileWriter बनाता है।
     *
     * 4. FileWriter(File file, boolean append)
     *    -> File Object के साथ Append Option भी देता है।
     *
     * ==================== IMPORTANT METHODS =======================
     *
     * 1. write(int c)
     *    -> File में एक Character लिखता है।
     *
     * 2. write(String str)
     *    -> पूरी String को File में लिखता है।
     *
     * 3. write(char[] c)
     *    -> Character Array को File में लिखता है।
     *
     * 4. write(char[] c, int off, int len)
     *    -> Character Array के दिए गए Offset से निर्धारित
     *       Length तक के Characters लिखता है।
     *
     * 5. append(char c)
     *    -> File में एक Character जोड़ता है।
     *
     * 6. append(CharSequence csq)
     *    -> File में पूरी Character Sequence (जैसे String) जोड़ता है।
     *
     * 7. flush()
     *    -> Buffer में मौजूद Pending Data को File में भेजता है।
     *
     * 8. close()
     *    -> FileWriter को बंद करता है।
     *    -> उससे जुड़े Resources को Release करता है।
     *
     * ==================== IMPORTANT POINTS ========================
     *
     * 1. FileWriter Character-Based Writer है।
     *    -> इसका उपयोग Text Data लिखने के लिए होता है।
     *
     * 2. अगर File मौजूद नहीं है, तो FileWriter उसे Create कर सकता है।
     *
     * 3. Default Constructor पुराने Content को Overwrite करता है।
     *
     * 4. पुराने Content को सुरक्षित रखने के लिए append = true करें।
     *
     * 5. FileWriter के Methods IOException Throw कर सकते हैं।
     *
     * 6. काम पूरा होने के बाद FileWriter को Close करना चाहिए।
     *
     * 7. try-with-resources का उपयोग करने पर FileWriter
     *    अपने आप Close हो जाता है।
     *
     * ==============================================================
     */


}
