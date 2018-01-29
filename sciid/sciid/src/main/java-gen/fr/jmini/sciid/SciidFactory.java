/**
 */
package fr.jmini.sciid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.jmini.sciid.SciidPackage
 * @generated
 */
public interface SciidFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SciidFactory eINSTANCE = fr.jmini.sciid.impl.SciidFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SAuthor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SAuthor</em>'.
	 * @generated
	 */
	SAuthor createSAuthor();

	/**
	 * Returns a new object of class '<em>SBlock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SBlock</em>'.
	 * @generated
	 */
	SBlock createSBlock();

	/**
	 * Returns a new object of class '<em>SCell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SCell</em>'.
	 * @generated
	 */
	SCell createSCell();

	/**
	 * Returns a new object of class '<em>SColumn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SColumn</em>'.
	 * @generated
	 */
	SColumn createSColumn();

	/**
	 * Returns a new object of class '<em>SContent Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SContent Node</em>'.
	 * @generated
	 */
	SContentNode createSContentNode();

	/**
	 * Returns a new object of class '<em>SContent Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SContent Part</em>'.
	 * @generated
	 */
	SContentPart createSContentPart();

	/**
	 * Returns a new object of class '<em>SCursor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SCursor</em>'.
	 * @generated
	 */
	SCursor createSCursor();

	/**
	 * Returns a new object of class '<em>SDescription List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDescription List</em>'.
	 * @generated
	 */
	SDescriptionList createSDescriptionList();

	/**
	 * Returns a new object of class '<em>SDescription List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDescription List Entry</em>'.
	 * @generated
	 */
	SDescriptionListEntry createSDescriptionListEntry();

	/**
	 * Returns a new object of class '<em>SDocument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDocument</em>'.
	 * @generated
	 */
	SDocument createSDocument();

	/**
	 * Returns a new object of class '<em>SDocument Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDocument Header</em>'.
	 * @generated
	 */
	SDocumentHeader createSDocumentHeader();

	/**
	 * Returns a new object of class '<em>SList</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SList</em>'.
	 * @generated
	 */
	SList createSList();

	/**
	 * Returns a new object of class '<em>SList Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SList Item</em>'.
	 * @generated
	 */
	SListItem createSListItem();

	/**
	 * Returns a new object of class '<em>SPhrase Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SPhrase Node</em>'.
	 * @generated
	 */
	SPhraseNode createSPhraseNode();

	/**
	 * Returns a new object of class '<em>SRevision Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SRevision Info</em>'.
	 * @generated
	 */
	SRevisionInfo createSRevisionInfo();

	/**
	 * Returns a new object of class '<em>SRow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SRow</em>'.
	 * @generated
	 */
	SRow createSRow();

	/**
	 * Returns a new object of class '<em>SSection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SSection</em>'.
	 * @generated
	 */
	SSection createSSection();

	/**
	 * Returns a new object of class '<em>SStructural Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SStructural Node</em>'.
	 * @generated
	 */
	SStructuralNode createSStructuralNode();

	/**
	 * Returns a new object of class '<em>SStructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SStructured Document</em>'.
	 * @generated
	 */
	SStructuredDocument createSStructuredDocument();

	/**
	 * Returns a new object of class '<em>STable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STable</em>'.
	 * @generated
	 */
	STable createSTable();

	/**
	 * Returns a new object of class '<em>STitle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STitle</em>'.
	 * @generated
	 */
	STitle createSTitle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SciidPackage getSciidPackage();

} //SciidFactory
