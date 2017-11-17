/**
 */
package fr.jmini.eadoc;

import java.util.List;

import org.asciidoctor.ast.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBlock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.EBlock#getLines <em>Lines</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EBlock#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getEBlock()
 * @model superTypes="fr.jmini.eadoc.EStructuralNode fr.jmini.eadoc.Block"
 * @generated
 */
public interface EBlock extends EStructuralNode, Block {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @return The original content of this block
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lines</em>' attribute.
	 * @see #setLines(List)
	 * @see fr.jmini.eadoc.EadocPackage#getEBlock_Lines()
	 * @model unique="false" dataType="fr.jmini.eadoc.StringList"
	 * @generated
	 */
	List<String> getLines();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EBlock#getLines <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lines</em>' attribute.
	 * @see #getLines()
	 * @generated
	 */
	void setLines(List<String> value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see fr.jmini.eadoc.EadocPackage#getEBlock_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EBlock#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@link #getLines}
	 * <!-- end-model-doc -->
	 * @model dataType="fr.jmini.eadoc.StringList" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getLines();'"
	 * @generated
	 */
	List<String> lines();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@link #getSource}
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSource();'"
	 * @generated
	 */
	String source();

} // EBlock
