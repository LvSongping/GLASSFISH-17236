/* -----------------------------------------------------------------------------
  Simple test of a Managed Bean for JavaServer Faces.
  --------------------------------------------------------------------------- */
package aoc.arkansas;

import javax.faces.bean.ManagedBean;

import aoc.arkansas.ejb.ReportProviderBean;

import javax.ejb.EJB;


@ManagedBean
public class TestFaces
{
  @EJB
  ReportProviderBean _rptbean;
  
  private int testint     = 0;
  
  public TestFaces()      { this.testint  = 1;    }
  public int gettestint() { return this.testint;  }
}
