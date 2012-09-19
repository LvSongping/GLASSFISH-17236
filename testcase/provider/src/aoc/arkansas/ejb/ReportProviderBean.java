/*==============================================================================
Rob Benton
03/04/2011
--------------------------------------------------------------------------------
Description:
This bean provides methods that list information about the reports currently
available for execution.
==============================================================================*/
package aoc.arkansas.ejb;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.sql.Connection;

import java.util.Vector;
import java.util.Map;
import java.util.HashMap;

import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.jar.Attributes;

import java.util.jar.Attributes.Name;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.export.JRPdfExporter;


@Stateless
public class ReportProviderBean
{
  
}
