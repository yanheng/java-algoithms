package com.think.in.java.chapter10.demo05;

public class Parcel6 {
  private void internalTracking(boolean b) {
    if (b) {
      class TrackingSlip {
        private String id;

        TrackingSlip(String s) {
          this.id = s;
        }

        public String getId() {
          return id;
        }
      }

      TrackingSlip slip = new TrackingSlip("slip");
      String s = slip.getId();
      System.out.println(s);
    }

  }

  public void track() {
    internalTracking(true);
  }


  public static void main(String[] args) {
    Parcel6 p = new Parcel6();
    p.track();
    p.internalTracking(false);
  }
}
