package Cccc;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: Cccc.Kkkkkkkkkkkkkkkkkkkkkkkkk */
public final class C0893Kkkkkkkkkkkkkkkkkkkkkkkkk {
    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }

    public static boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwww(XmlPullParser xmlPullParser, String str) {
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(xmlPullParser) && Wwwwwwwwwwwwwwwwwwwwwwwwwww(xmlPullParser.getName()).equals(str);
    }

    public static boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(XmlPullParser xmlPullParser, String str) {
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(XmlPullParser xmlPullParser, String str) {
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (Wwwwwwwwwwwwwwwwwwwwwwwwwww(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
