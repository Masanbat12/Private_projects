# Ping and Watchdog
מטרת המטלה :
PING :
הפקודה ping משמשת לבדיקת החיבור בין 2 מחשבים, בחלק הזה במטלה התבקשנו לכתוב קוד בשם
" ping.py " ,התוכנית תשלח ICMP ECHO REQUEST ל Host , ובעת קבלת ICMP-ECHO-REPLY ,
התוכנית תשלח את ICMP ECHO REQUEST הבא .בעצם שולחת לכתובת IP פינג בעזרת raw socket
בפרוטוקול ICMP , עבור כל פאקטה שהתקבלה, נדפיס את הבי יטים שהתקבלו מה- IP שנשלחה אליה ping ,
sequence number של הפאקטה והזמן בין ה- ICMP ECHO REQUEST לבין ה- ICMP ECHO REPLY.
Watchdog + Better ping:
זה בעצם לכתוב קוד כמו תוכנית הראשונה ששולחת , ping על ידי שימוש ב Socket - Raw
ובפרוטוקול ICMP אבל הפעם נוסי ף watchdog שבמקרה בו אנו לא מקבלים REPLY-ECHO-ICMP תוך
10 שניות מרגע הבקשה התוכנית תיסגר ותדפיס הודעת שגיאה .
תיאור הקוד :
התוכנית כתובה בשפת Python וכוללת תיעוד מלא בתוכה.
המטלה מחולקת ל 2 חלקים , החלק הראשון זה הקוד ' ping.py ' והחלק השני הקודים בשם
' better_ping.py ' ו – ' watchdog.py .'
אופן הרצה :
1 ) נריץ את הפקודה sudo python3 ping.py <IP address> בטרמינל .
2 ) נריץ את הפקודה sudo python3 better_ping.py <IP address> בטרמינ ל .
מערכת ההפעל ה :
22.10LTD Ubuntu

## Ping.py
  הוא מייבא את הספריות הבאות :
os : שהיא מערכת הפעלה לפונקציונליות מערכת ההפעלה.
socket : לתקשורת רשת .
struct : עבור אריזה ופריקה של נתונים בינאריי ם .
sys : לפרמטרים ופונקציות ספציפיות למערכת .
time : לפונקציות הקשורות לזמן .
select : לריבוי קלט/פלט .
