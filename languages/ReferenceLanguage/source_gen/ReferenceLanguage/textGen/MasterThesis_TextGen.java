package ReferenceLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class MasterThesis_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("[");
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.serNumber$3owZ) + "] ");
    tgs.appendNode(SLinkOperations.getTarget(ctx.getPrimaryInput(), LINKS.author$lVA4));
    tgs.append(". ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.title$lW46) + ". Master's thesis, ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.school$lWy8) + ", ");
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.address$m36$) != null) {
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.address$m36$) + ", ");
    }
    if (SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.month$m4hD) != null) {
      tgs.append(SPropertyOperations.getEnum(ctx.getPrimaryInput(), PROPS.month$m4hD) + ". ");
    }
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.year$lXfb) + ".");
  }

  private static final class PROPS {
    /*package*/ static final SProperty serNumber$3owZ = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1e3ba47b555fd52cL, 0x1159e6fb6e9e4ecbL, "serNumber");
    /*package*/ static final SProperty title$lW46 = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dc25L, 0x1da23d5c1241dc28L, "title");
    /*package*/ static final SProperty school$lWy8 = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dc25L, 0x1da23d5c1241dc2aL, "school");
    /*package*/ static final SProperty address$m36$ = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dc25L, 0x1da23d5c1241dc31L, "address");
    /*package*/ static final SProperty month$m4hD = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dc25L, 0x1da23d5c1241dc36L, "month");
    /*package*/ static final SProperty year$lXfb = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dc25L, 0x1da23d5c1241dc2dL, "year");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink author$lVA4 = MetaAdapterFactory.getContainmentLink(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dc25L, 0x1da23d5c1241dc26L, "author");
  }
}
