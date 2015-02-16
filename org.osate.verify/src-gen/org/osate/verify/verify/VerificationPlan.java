/**
 */
package org.osate.verify.verify;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.ComponentClassifier;

import org.osate.alisa.common.common.Rationale;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getTitle <em>Title</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getDescription <em>Description</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.osate.verify.verify.VerificationPlan#getVerifiedAssumption <em>Verified Assumption</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan()
 * @model
 * @generated
 */
public interface VerificationPlan extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.osate.verify.verify.VerificationPlan#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.osate.verify.verify.VerificationPlan#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ComponentClassifier)
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Target()
   * @model
   * @generated
   */
  ComponentClassifier getTarget();

  /**
   * Sets the value of the '{@link org.osate.verify.verify.VerificationPlan#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ComponentClassifier value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.osate.verify.verify.VerificationPlan#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Claim</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.verify.verify.Claim}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Claim</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Claim</em>' containment reference list.
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Claim()
   * @model containment="true"
   * @generated
   */
  EList<Claim> getClaim();

  /**
   * Returns the value of the '<em><b>Rationale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rationale</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rationale</em>' containment reference.
   * @see #setRationale(Rationale)
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_Rationale()
   * @model containment="true"
   * @generated
   */
  Rationale getRationale();

  /**
   * Sets the value of the '{@link org.osate.verify.verify.VerificationPlan#getRationale <em>Rationale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rationale</em>' containment reference.
   * @see #getRationale()
   * @generated
   */
  void setRationale(Rationale value);

  /**
   * Returns the value of the '<em><b>Verified Assumption</b></em>' reference list.
   * The list contents are of type {@link org.osate.aadl2.ComponentClassifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verified Assumption</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verified Assumption</em>' reference list.
   * @see org.osate.verify.verify.VerifyPackage#getVerificationPlan_VerifiedAssumption()
   * @model
   * @generated
   */
  EList<ComponentClassifier> getVerifiedAssumption();

} // VerificationPlan
