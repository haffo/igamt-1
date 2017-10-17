/**
 * This software was developed at the National Institute of Standards and Technology by employees of
 * the Federal Government in the course of their official duties. Pursuant to title 17 Section 105
 * of the United States Code this software is not subject to copyright protection and is in the
 * public domain. This is an experimental system. NIST assumes no responsibility whatsoever for its
 * use by other parties, and makes no guarantees, expressed or implied, about its quality,
 * reliability, or any other characteristic. We would appreciate acknowledgement if the software is
 * used. This software can be redistributed and/or modified freely provided that any derivative
 * works bear some notice that they are derived from it, and any modified versions bear some notice
 * that they have been modified. Ismail Mellouli (NIST) Apr 5, 2017
 */

package gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain;

public class ProfileComponentItemSource {

  private String messageId;
  private String segmentId;
  private String fieldDt;
  private String componentDt;

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public String getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }

  public String getFieldDt() {
    return fieldDt;
  }

  public void setFieldDt(String fieldDt) {
    this.fieldDt = fieldDt;
  }

  public String getComponentDt() {
    return componentDt;
  }

  public void setComponentDt(String componentDt) {
    this.componentDt = componentDt;
  }


}
