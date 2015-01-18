/**
 */
package org.osate.alisa.workbench.alisa.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.alisa.workbench.alisa.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.alisa.workbench.alisa.AlisaPackage
 * @generated
 */
public class AlisaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlisaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlisaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AlisaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AlisaPackage.ALISA_WORK_AREA:
      {
        AlisaWorkArea alisaWorkArea = (AlisaWorkArea)theEObject;
        T result = caseAlisaWorkArea(alisaWorkArea);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.ASSURANCE_CASE_PLAN:
      {
        AssuranceCasePlan assuranceCasePlan = (AssuranceCasePlan)theEObject;
        T result = caseAssuranceCasePlan(assuranceCasePlan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.SELECTION_CONDITION_EXPR:
      {
        SelectionConditionExpr selectionConditionExpr = (SelectionConditionExpr)theEObject;
        T result = caseSelectionConditionExpr(selectionConditionExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.SELECTION_CATEGORY_REFERENCE:
      {
        SelectionCategoryReference selectionCategoryReference = (SelectionCategoryReference)theEObject;
        T result = caseSelectionCategoryReference(selectionCategoryReference);
        if (result == null) result = caseSelectionConditionExpr(selectionCategoryReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.AND_SELECTION_CONDITION_EXPR:
      {
        AndSelectionConditionExpr andSelectionConditionExpr = (AndSelectionConditionExpr)theEObject;
        T result = caseAndSelectionConditionExpr(andSelectionConditionExpr);
        if (result == null) result = caseSelectionConditionExpr(andSelectionConditionExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Work Area</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work Area</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlisaWorkArea(AlisaWorkArea object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assurance Case Plan</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assurance Case Plan</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssuranceCasePlan(AssuranceCasePlan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Condition Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Condition Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionConditionExpr(SelectionConditionExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Category Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Category Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionCategoryReference(SelectionCategoryReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Selection Condition Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Selection Condition Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndSelectionConditionExpr(AndSelectionConditionExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AlisaSwitch
