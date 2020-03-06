package org.isf.dicom.manager;

import org.isf.dicom.model.FileDicom;
import org.isf.utils.exception.OHServiceException;

/**
 * Interface for definitions IO for Dicom acquired files
 * @author Pietro Castellucci
 * @version 1.0.0 
 */
public interface DicomManagerInterface 
{   
    /**
     * Load a list of idfile for series
     * @param idPaziente, the patient id
     * @param numeroSerie, the series number
     * @return
     * @throws OHServiceException 
     */
    public Long[] getSerieDetail(int idPaziente, String numeroSerie) throws OHServiceException;

    /**
     * Delete series 
     * @param idPaziente, the id of patient
     * @param numeroSerie, the series number to delete
     * @return, true if success
     * @throws OHServiceException 
     */
    boolean deleteSerie(int idPaziente, String numeroSerie) throws OHServiceException ;
    
    /**
    * Check if dicom is loaded
    * @param dicom, the detail od dicom
    * @return true if file exist
     * @throws OHServiceException 
    */
    public boolean exist(FileDicom dicom) throws OHServiceException;
    
    /**
     * Check if dicom is loaded
     * @param patientID, the id of patient
     * @param numeroSerie, the series number
     * @return true if file exist
      * @throws OHServiceException 
     */
     public boolean exist(int patientID, String numeroSerie) throws OHServiceException;

    /**
     * Load the Detail of DICOM
     * @param, idFile
     * @return, FileDicom
     * @throws OHServiceException 
     */
    public FileDicom loadDetails(Long idFile, int idPaziente, String numeroSerie) throws OHServiceException;

    /**
     * Load detail
     * @param idPaziente, the id of patient
     * @param numeroSerie, numero della serie
     * @return, details
     * @throws OHServiceException 
     */
    public FileDicom loadDetails(long idFile, int idPaziente, String numeroSerie) throws OHServiceException;

    /**
     * load metadata from DICOM files fo the patient
     * @param idPaziente
     * @return
     * @throws OHServiceException 
     */
    public FileDicom[] loadFilesPaziente(int idPaziente) throws OHServiceException;

    /**
     * save the DICOM file and metadata
     * @param dicom
     * @throws OHServiceException 
     */
    public void saveFile(FileDicom dicom) throws OHServiceException;
}
