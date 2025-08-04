/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bjc
 */
import java.util.ArrayList;
import java.util.List;

public class NoticeSubject {
    private static NoticeSubject instance = new NoticeSubject();

    private List<NoticeObserver> observers = new ArrayList<>();
    private List<String> notices = new ArrayList<>();

    private NoticeSubject() { }

    public static NoticeSubject getInstance() {
        return instance;
    }

    public void registerObserver(NoticeObserver o) {
        observers.add(o);
        System.out.println("Observer added, total: " + observers.size());
    }

    public void removeObserver(NoticeObserver o) {
        observers.remove(o);
    }

    public void addNotice(String notice) {
        notices.add(notice);
        System.out.println("Notice added: " + notice);
        notifyObservers();
    }

    public List<String> getNotices() {
        return new ArrayList<>(notices);
    }

    private void notifyObservers() {
        System.out.println("Notifying " + observers.size() + " observers");
        for (NoticeObserver o : observers) {
            o.updateNotices(getNotices());
        }
    }
}
