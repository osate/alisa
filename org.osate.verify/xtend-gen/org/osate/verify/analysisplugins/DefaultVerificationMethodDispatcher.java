package org.osate.verify.analysisplugins;

import com.google.common.base.Objects;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.verify.analysisplugins.AnalysisPluginInterface;
import org.osate.verify.util.IVerificationMethodDispatcher;
import org.osate.verify.verify.VerificationMethod;

@SuppressWarnings("all")
public class DefaultVerificationMethodDispatcher implements IVerificationMethodDispatcher {
  public Object dispatchVerificationMethod(final VerificationMethod vm, final InstanceObject target) {
    String _methodPath = vm.getMethodPath();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_methodPath, "org.osate.assure.analysis.PlatformResourceBudgets.flowLatencyAnalysis")) {
        _matched=true;
        return AnalysisPluginInterface.flowLatencyAnalysis(target);
      }
    }
    if (!_matched) {
      if (Objects.equal(_methodPath, "org.osate.assure.analysis.PlatformResourceBudgets.A429Consistency")) {
        _matched=true;
        return AnalysisPluginInterface.A429Consistency(target);
      }
    }
    if (!_matched) {
      if (Objects.equal(_methodPath, "org.osate.assure.analysis.PlatformResourceBudgets.ConnectionBindingConsistency")) {
        _matched=true;
        return AnalysisPluginInterface.ConnectionBindingConsistency(target);
      }
    }
    if (!_matched) {
      if (Objects.equal(_methodPath, "org.osate.assure.analysis.PlatformResourceBudgets.PowerAnalysis")) {
        _matched=true;
        return AnalysisPluginInterface.PowerAnalysis(target);
      }
    }
    if (!_matched) {
      if (Objects.equal(_methodPath, "org.osate.assure.analysis.PlatformResourceBudgets.PortDataConsistency")) {
        _matched=true;
        return AnalysisPluginInterface.PortDataConsistency(target);
      }
    }
    if (!_matched) {
      if (Objects.equal(_methodPath, "org.osate.assure.analysis.PlatformResourceBudgets.MassAnalysis")) {
        _matched=true;
        return AnalysisPluginInterface.MassAnalysis(target);
      }
    }
    return null;
  }
}
