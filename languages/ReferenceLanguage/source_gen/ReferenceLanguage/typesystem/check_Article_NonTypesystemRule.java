package ReferenceLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;

public class check_Article_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_Article_NonTypesystemRule() {
  }
  public void applyRule(final SNode article, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (isEmptyString(SPropertyOperations.getString(article, PROPS.title$67zM)) || (SPropertyOperations.getString(article, PROPS.title$67zM).equalsIgnoreCase("Enter article title"))) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(article, "Title could not be empty!", "r:43f71e48-a850-46da-878a-0fd5ec7107b1(ReferenceLanguage.typesystem)", "2178515694384781728", null, errorTarget);
      }
    }
    if (isEmptyString(SPropertyOperations.getString(article, PROPS.journal$68gP))) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(article, "Journal could not be empty", "r:43f71e48-a850-46da-878a-0fd5ec7107b1(ReferenceLanguage.typesystem)", "2178515694384785101", null, errorTarget);
      }
    }
    if (SPropertyOperations.getInteger(article, PROPS.year$6enf) == 0) {
      {
        final MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(article, "Year could not be empty", "r:43f71e48-a850-46da-878a-0fd5ec7107b1(ReferenceLanguage.typesystem)", "2178515694384802386", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return CONCEPTS.Article$DB;
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static boolean isEmptyString(String str) {
    return str == null || str.isEmpty();
  }

  private static final class PROPS {
    /*package*/ static final SProperty title$67zM = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, 0x1a03dc0acd30fbfeL, "title");
    /*package*/ static final SProperty journal$68gP = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, 0x1a03dc0acd30fc01L, "journal");
    /*package*/ static final SProperty year$6enf = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, 0x1a03dc0acd30fc06L, "year");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Article$DB = MetaAdapterFactory.getConcept(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, "ReferenceLanguage.structure.Article");
  }
}
