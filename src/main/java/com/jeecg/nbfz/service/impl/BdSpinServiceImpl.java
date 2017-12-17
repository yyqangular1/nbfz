package com.jeecg.nbfz.service.impl;
import com.jeecg.nbfz.entity.BdSpinEntity;
import com.jeecg.nbfz.service.BdSpinServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service("bdSpinService")
@Transactional
public class BdSpinServiceImpl extends CommonServiceImpl implements BdSpinServiceI {

	
 	@Override
	public void delete(BdSpinEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}

	@Override
 	public Serializable save(BdSpinEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}

	@Override
 	public void saveOrUpdate(BdSpinEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(BdSpinEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 更新操作增强业务
	 * @param t
	 * @return
	 */
	private void doUpdateBus(BdSpinEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	this.calculate(t);
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}

	/**
	 * 逻辑计算
	 * @param t
	 */
	private void calculate(BdSpinEntity t) {
	}

	/**
	 * 删除操作增强业务
	 * @return
	 */
	private void doDelBus(BdSpinEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------

		this.calculate(t);
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(BdSpinEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("create_name", t.getCreateName());
		map.put("create_by", t.getCreateBy());
		map.put("create_date", t.getCreateDate());
		map.put("update_name", t.getUpdateName());
		map.put("update_by", t.getUpdateBy());
		map.put("update_date", t.getUpdateDate());
		map.put("sys_org_code", t.getSysOrgCode());
		map.put("sys_company_code", t.getSysCompanyCode());
		map.put("bpm_status", t.getBpmStatus());
		map.put("spinaa", t.getSpinaa());
		map.put("spinab", t.getSpinab());
		map.put("spinac", t.getSpinac());
		map.put("spinad", t.getSpinad());
		map.put("spinae", t.getSpinae());
		map.put("spinaf", t.getSpinaf());
		map.put("spinag", t.getSpinag());
		map.put("spinah", t.getSpinah());
		map.put("spinai", t.getSpinai());
		map.put("spinaj", t.getSpinaj());
		map.put("spinak", t.getSpinak());
		map.put("spinal", t.getSpinal());
		map.put("spinam", t.getSpinam());
		map.put("spinan", t.getSpinan());
		map.put("spinao", t.getSpinao());
		map.put("spinap", t.getSpinap());
		map.put("spinaq", t.getSpinaq());
		map.put("spinar", t.getSpinar());
		map.put("spinas", t.getSpinas());
		map.put("spinat", t.getSpinat());
		map.put("spinau", t.getSpinau());
		map.put("spinav", t.getSpinav());
		map.put("spinaw", t.getSpinaw());
		map.put("spinax", t.getSpinax());
		map.put("spinay", t.getSpinay());
		map.put("spinaz", t.getSpinaz());
		map.put("spinaaa", t.getSpinaaa());
		map.put("spinaab", t.getSpinaab());
		map.put("spinaac", t.getSpinaac());
		map.put("spinaad", t.getSpinaad());
		map.put("spinaae", t.getSpinaae());
		map.put("spinaaf", t.getSpinaaf());
		map.put("spinaag", t.getSpinaag());
		map.put("spinaah", t.getSpinaah());
		map.put("spinaai", t.getSpinaai());
		map.put("spinaaj", t.getSpinaaj());
		map.put("spinaak", t.getSpinaak());
		map.put("spinaal", t.getSpinaal());
		map.put("spinaam", t.getSpinaam());
		map.put("spinaan", t.getSpinaan());
		map.put("spinaao", t.getSpinaao());
		map.put("spinaap", t.getSpinaap());
		map.put("spinaaq", t.getSpinaaq());
		map.put("spinaar", t.getSpinaar());
		map.put("spinaas", t.getSpinaas());
		map.put("spinaat", t.getSpinaat());
		map.put("spinaau", t.getSpinaau());
		map.put("spinaav", t.getSpinaav());
		map.put("spinaaw", t.getSpinaaw());
		map.put("spinaax", t.getSpinaax());
		map.put("spinaay", t.getSpinaay());
		map.put("spinaaz", t.getSpinaaz());
		map.put("spinaba", t.getSpinaba());
		map.put("spinabb", t.getSpinabb());
		map.put("spinabc", t.getSpinabc());
		map.put("spinabd", t.getSpinabd());
		map.put("spinbe", t.getSpinbe());
		map.put("spinbf", t.getSpinbf());
		map.put("spinbg", t.getSpinbg());
		map.put("spinbh", t.getSpinbh());
		map.put("spinbi", t.getSpinbi());
		map.put("spinbj", t.getSpinbj());
		map.put("spinbk", t.getSpinbk());
		map.put("spinbl", t.getSpinbl());
		map.put("spinbm", t.getSpinbm());
		map.put("spinbn", t.getSpinbn());
		map.put("spinbo", t.getSpinbo());
		map.put("spinbp", t.getSpinbp());
		map.put("spinbq", t.getSpinbq());
		map.put("spinbr", t.getSpinbr());
		map.put("spinbs", t.getSpinbs());
		map.put("spinbt", t.getSpinbt());
		map.put("spinbu", t.getSpinbu());
		map.put("spinbv", t.getSpinbv());
		map.put("spinbw", t.getSpinbw());
		map.put("spinbx", t.getSpinbx());
		map.put("spinby", t.getSpinby());
		map.put("spinbz", t.getSpinbz());
		map.put("spinbaa", t.getSpinbaa());
		map.put("spinbab", t.getSpinbab());
		map.put("spinbac", t.getSpinbac());
		map.put("spinbad", t.getSpinbad());
		map.put("spinbae", t.getSpinbae());
		map.put("spinbaf", t.getSpinbaf());
		map.put("spinbag", t.getSpinbag());
		map.put("spinbah", t.getSpinbah());
		map.put("spinbai", t.getSpinbai());
		map.put("spince", t.getSpince());
		map.put("spincf", t.getSpincf());
		map.put("spincg", t.getSpincg());
		map.put("spinch", t.getSpinch());
		map.put("spinci", t.getSpinci());
		map.put("spincj", t.getSpincj());
		map.put("spinck", t.getSpinck());
		map.put("spincl", t.getSpincl());
		map.put("spincm", t.getSpincm());
		map.put("spincn", t.getSpincn());
		map.put("spinco", t.getSpinco());
		map.put("spincp", t.getSpincp());
		map.put("spincq", t.getSpincq());
		map.put("spincr", t.getSpincr());
		map.put("spincs", t.getSpincs());
		map.put("spinct", t.getSpinct());
		map.put("spincu", t.getSpincu());
		map.put("spincv", t.getSpincv());
		map.put("spincw", t.getSpincw());
		map.put("spincx", t.getSpincx());
		map.put("spincy", t.getSpincy());
		map.put("spincz", t.getSpincz());
		map.put("spincaa", t.getSpincaa());
		map.put("spincab", t.getSpincab());
		map.put("spincac", t.getSpincac());
		map.put("spincad", t.getSpincad());
		map.put("spincae", t.getSpincae());
		map.put("spincaf", t.getSpincaf());
		map.put("spincag", t.getSpincag());
		map.put("spincah", t.getSpincah());
		map.put("spincai", t.getSpincai());
		map.put("spincaj", t.getSpincaj());
		map.put("spincak", t.getSpincak());
		map.put("spincal", t.getSpincal());
		map.put("spincam", t.getSpincam());
		map.put("spincan", t.getSpincan());
		map.put("spincao", t.getSpincao());
		map.put("spincap", t.getSpincap());
		map.put("spincaq", t.getSpincaq());
		map.put("spincar", t.getSpincar());
		map.put("spincas", t.getSpincas());
		map.put("spincat", t.getSpincat());
		map.put("spindf", t.getSpindf());
		map.put("spindg", t.getSpindg());
		map.put("spindh", t.getSpindh());
		map.put("spindi", t.getSpindi());
		map.put("spindj", t.getSpindj());
		map.put("spindk", t.getSpindk());
		map.put("spindl", t.getSpindl());
		map.put("spindm", t.getSpindm());
		map.put("spindn", t.getSpindn());
		map.put("spindo", t.getSpindo());
		map.put("spindp", t.getSpindp());
		map.put("spindq", t.getSpindq());
		map.put("spindr", t.getSpindr());
		map.put("spinds", t.getSpinds());
		map.put("spindt", t.getSpindt());
		map.put("spindu", t.getSpindu());
		map.put("spindv", t.getSpindv());
		map.put("spindw", t.getSpindw());
		map.put("spindx", t.getSpindx());
		map.put("spindy", t.getSpindy());
		map.put("spindz", t.getSpindz());
		map.put("spindaa", t.getSpindaa());
		map.put("spindab", t.getSpindab());
		map.put("spindac", t.getSpindac());
		map.put("spinef", t.getSpinef());
		map.put("spineg", t.getSpineg());
		map.put("spineh", t.getSpineh());
		map.put("spinei", t.getSpinei());
		map.put("spinej", t.getSpinej());
		map.put("spinek", t.getSpinek());
		map.put("spinel", t.getSpinel());
		map.put("spinem", t.getSpinem());
		map.put("spinen", t.getSpinen());
		map.put("spineo", t.getSpineo());
		map.put("spinep", t.getSpinep());
		map.put("spineq", t.getSpineq());
		map.put("spiner", t.getSpiner());
		map.put("spines", t.getSpines());
		map.put("spinet", t.getSpinet());
		map.put("spineu", t.getSpineu());
		map.put("spinev", t.getSpinev());
		map.put("spinew", t.getSpinew());
		map.put("spinex", t.getSpinex());
		map.put("spiney", t.getSpiney());
		map.put("spinez", t.getSpinez());
		map.put("spineaa", t.getSpineaa());
		map.put("spineab", t.getSpineab());
		map.put("spineac", t.getSpineac());
		map.put("spinead", t.getSpinead());
		map.put("spineae", t.getSpineae());
		map.put("spineaf", t.getSpineaf());
		map.put("spineag", t.getSpineag());
		map.put("spineah", t.getSpineah());
		map.put("spineai", t.getSpineai());
		map.put("spineaj", t.getSpineaj());
		map.put("spineak", t.getSpineak());
		map.put("spineal", t.getSpineal());
		map.put("spineam", t.getSpineam());
		map.put("spinean", t.getSpinean());
		map.put("spineao", t.getSpineao());
		map.put("spineap", t.getSpineap());
		map.put("spineaq", t.getSpineaq());
		map.put("spinear", t.getSpinear());
		map.put("spineas", t.getSpineas());
		map.put("spineat", t.getSpineat());
		map.put("spinff", t.getSpinff());
		map.put("spinfg", t.getSpinfg());
		map.put("spinfh", t.getSpinfh());
		map.put("spinfi", t.getSpinfi());
		map.put("spinfj", t.getSpinfj());
		map.put("spinfk", t.getSpinfk());
		map.put("spinfl", t.getSpinfl());
		map.put("spinfm", t.getSpinfm());
		map.put("spinfn", t.getSpinfn());
		map.put("spinfo", t.getSpinfo());
		map.put("spinfp", t.getSpinfp());
		map.put("spinfq", t.getSpinfq());
		map.put("spinfr", t.getSpinfr());
		map.put("spinfs", t.getSpinfs());
		map.put("spinft", t.getSpinft());
		map.put("spinfu", t.getSpinfu());
		map.put("spinfv", t.getSpinfv());
		map.put("spinfw", t.getSpinfw());
		map.put("spinfx", t.getSpinfx());
		map.put("spinfy", t.getSpinfy());
		map.put("spinfz", t.getSpinfz());
		map.put("spinfaa", t.getSpinfaa());
		map.put("spinfab", t.getSpinfab());
		map.put("spinfac", t.getSpinfac());
		map.put("spingf", t.getSpingf());
		map.put("spingg", t.getSpingg());
		map.put("spingh", t.getSpingh());
		map.put("spingi", t.getSpingi());
		map.put("spingj", t.getSpingj());
		map.put("spingk", t.getSpingk());
		map.put("spingl", t.getSpingl());
		map.put("spingm", t.getSpingm());
		map.put("spingn", t.getSpingn());
		map.put("spingo", t.getSpingo());
		map.put("spingp", t.getSpingp());
		map.put("spingq", t.getSpingq());
		map.put("spingr", t.getSpingr());
		map.put("spings", t.getSpings());
		map.put("spingt", t.getSpingt());
		map.put("spingu", t.getSpingu());
		map.put("spingv", t.getSpingv());
		map.put("spingw", t.getSpingw());
		map.put("spinhe", t.getSpinhe());
		map.put("spinhf", t.getSpinhf());
		map.put("spinhg", t.getSpinhg());
		map.put("spinhh", t.getSpinhh());
		map.put("spinhi", t.getSpinhi());
		map.put("spinhj", t.getSpinhj());
		map.put("spinhk", t.getSpinhk());
		map.put("spinhl", t.getSpinhl());
		map.put("spinhm", t.getSpinhm());
		map.put("spinhn", t.getSpinhn());
		map.put("spinho", t.getSpinho());
		map.put("spinhp", t.getSpinhp());
		map.put("spinhq", t.getSpinhq());
		map.put("spinhr", t.getSpinhr());
		map.put("spinhs", t.getSpinhs());
		map.put("spinht", t.getSpinht());
		map.put("spinhu", t.getSpinhu());
		map.put("spinhv", t.getSpinhv());
		map.put("spinhw", t.getSpinhw());
		map.put("spinhx", t.getSpinhx());
		map.put("spinhy", t.getSpinhy());
		map.put("spinhz", t.getSpinhz());
		map.put("spinhaa", t.getSpinhaa());
		map.put("spinhab", t.getSpinhab());
		map.put("spinhac", t.getSpinhac());
		map.put("spinhad", t.getSpinhad());
		map.put("spinhae", t.getSpinhae());
		map.put("spinhaf", t.getSpinhaf());
        map.put("mllx", t.getMllx());
        map.put("ccdw", t.getCcdw());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,BdSpinEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
 		sql  = sql.replace("#{create_by}",String.valueOf(t.getCreateBy()));
 		sql  = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
 		sql  = sql.replace("#{update_name}",String.valueOf(t.getUpdateName()));
 		sql  = sql.replace("#{update_by}",String.valueOf(t.getUpdateBy()));
 		sql  = sql.replace("#{update_date}",String.valueOf(t.getUpdateDate()));
 		sql  = sql.replace("#{sys_org_code}",String.valueOf(t.getSysOrgCode()));
 		sql  = sql.replace("#{sys_company_code}",String.valueOf(t.getSysCompanyCode()));
 		sql  = sql.replace("#{bpm_status}",String.valueOf(t.getBpmStatus()));
 		sql  = sql.replace("#{spinaa}",String.valueOf(t.getSpinaa()));
 		sql  = sql.replace("#{spinab}",String.valueOf(t.getSpinab()));
 		sql  = sql.replace("#{spinac}",String.valueOf(t.getSpinac()));
 		sql  = sql.replace("#{spinad}",String.valueOf(t.getSpinad()));
 		sql  = sql.replace("#{spinae}",String.valueOf(t.getSpinae()));
 		sql  = sql.replace("#{spinaf}",String.valueOf(t.getSpinaf()));
 		sql  = sql.replace("#{spinag}",String.valueOf(t.getSpinag()));
 		sql  = sql.replace("#{spinah}",String.valueOf(t.getSpinah()));
 		sql  = sql.replace("#{spinai}",String.valueOf(t.getSpinai()));
 		sql  = sql.replace("#{spinaj}",String.valueOf(t.getSpinaj()));
 		sql  = sql.replace("#{spinak}",String.valueOf(t.getSpinak()));
 		sql  = sql.replace("#{spinal}",String.valueOf(t.getSpinal()));
 		sql  = sql.replace("#{spinam}",String.valueOf(t.getSpinam()));
 		sql  = sql.replace("#{spinan}",String.valueOf(t.getSpinan()));
 		sql  = sql.replace("#{spinao}",String.valueOf(t.getSpinao()));
 		sql  = sql.replace("#{spinap}",String.valueOf(t.getSpinap()));
 		sql  = sql.replace("#{spinaq}",String.valueOf(t.getSpinaq()));
 		sql  = sql.replace("#{spinar}",String.valueOf(t.getSpinar()));
 		sql  = sql.replace("#{spinas}",String.valueOf(t.getSpinas()));
 		sql  = sql.replace("#{spinat}",String.valueOf(t.getSpinat()));
 		sql  = sql.replace("#{spinau}",String.valueOf(t.getSpinau()));
 		sql  = sql.replace("#{spinav}",String.valueOf(t.getSpinav()));
 		sql  = sql.replace("#{spinaw}",String.valueOf(t.getSpinaw()));
 		sql  = sql.replace("#{spinax}",String.valueOf(t.getSpinax()));
 		sql  = sql.replace("#{spinay}",String.valueOf(t.getSpinay()));
 		sql  = sql.replace("#{spinaz}",String.valueOf(t.getSpinaz()));
 		sql  = sql.replace("#{spinaaa}",String.valueOf(t.getSpinaaa()));
 		sql  = sql.replace("#{spinaab}",String.valueOf(t.getSpinaab()));
 		sql  = sql.replace("#{spinaac}",String.valueOf(t.getSpinaac()));
 		sql  = sql.replace("#{spinaad}",String.valueOf(t.getSpinaad()));
 		sql  = sql.replace("#{spinaae}",String.valueOf(t.getSpinaae()));
 		sql  = sql.replace("#{spinaaf}",String.valueOf(t.getSpinaaf()));
 		sql  = sql.replace("#{spinaag}",String.valueOf(t.getSpinaag()));
 		sql  = sql.replace("#{spinaah}",String.valueOf(t.getSpinaah()));
 		sql  = sql.replace("#{spinaai}",String.valueOf(t.getSpinaai()));
 		sql  = sql.replace("#{spinaaj}",String.valueOf(t.getSpinaaj()));
 		sql  = sql.replace("#{spinaak}",String.valueOf(t.getSpinaak()));
 		sql  = sql.replace("#{spinaal}",String.valueOf(t.getSpinaal()));
 		sql  = sql.replace("#{spinaam}",String.valueOf(t.getSpinaam()));
 		sql  = sql.replace("#{spinaan}",String.valueOf(t.getSpinaan()));
 		sql  = sql.replace("#{spinaao}",String.valueOf(t.getSpinaao()));
 		sql  = sql.replace("#{spinaap}",String.valueOf(t.getSpinaap()));
 		sql  = sql.replace("#{spinaaq}",String.valueOf(t.getSpinaaq()));
 		sql  = sql.replace("#{spinaar}",String.valueOf(t.getSpinaar()));
 		sql  = sql.replace("#{spinaas}",String.valueOf(t.getSpinaas()));
 		sql  = sql.replace("#{spinaat}",String.valueOf(t.getSpinaat()));
 		sql  = sql.replace("#{spinaau}",String.valueOf(t.getSpinaau()));
 		sql  = sql.replace("#{spinaav}",String.valueOf(t.getSpinaav()));
 		sql  = sql.replace("#{spinaaw}",String.valueOf(t.getSpinaaw()));
 		sql  = sql.replace("#{spinaax}",String.valueOf(t.getSpinaax()));
 		sql  = sql.replace("#{spinaay}",String.valueOf(t.getSpinaay()));
 		sql  = sql.replace("#{spinaaz}",String.valueOf(t.getSpinaaz()));
 		sql  = sql.replace("#{spinaba}",String.valueOf(t.getSpinaba()));
 		sql  = sql.replace("#{spinabb}",String.valueOf(t.getSpinabb()));
 		sql  = sql.replace("#{spinabc}",String.valueOf(t.getSpinabc()));
 		sql  = sql.replace("#{spinabd}",String.valueOf(t.getSpinabd()));
 		sql  = sql.replace("#{spinbe}",String.valueOf(t.getSpinbe()));
 		sql  = sql.replace("#{spinbf}",String.valueOf(t.getSpinbf()));
 		sql  = sql.replace("#{spinbg}",String.valueOf(t.getSpinbg()));
 		sql  = sql.replace("#{spinbh}",String.valueOf(t.getSpinbh()));
 		sql  = sql.replace("#{spinbi}",String.valueOf(t.getSpinbi()));
 		sql  = sql.replace("#{spinbj}",String.valueOf(t.getSpinbj()));
 		sql  = sql.replace("#{spinbk}",String.valueOf(t.getSpinbk()));
 		sql  = sql.replace("#{spinbl}",String.valueOf(t.getSpinbl()));
 		sql  = sql.replace("#{spinbm}",String.valueOf(t.getSpinbm()));
 		sql  = sql.replace("#{spinbn}",String.valueOf(t.getSpinbn()));
 		sql  = sql.replace("#{spinbo}",String.valueOf(t.getSpinbo()));
 		sql  = sql.replace("#{spinbp}",String.valueOf(t.getSpinbp()));
 		sql  = sql.replace("#{spinbq}",String.valueOf(t.getSpinbq()));
 		sql  = sql.replace("#{spinbr}",String.valueOf(t.getSpinbr()));
 		sql  = sql.replace("#{spinbs}",String.valueOf(t.getSpinbs()));
 		sql  = sql.replace("#{spinbt}",String.valueOf(t.getSpinbt()));
 		sql  = sql.replace("#{spinbu}",String.valueOf(t.getSpinbu()));
 		sql  = sql.replace("#{spinbv}",String.valueOf(t.getSpinbv()));
 		sql  = sql.replace("#{spinbw}",String.valueOf(t.getSpinbw()));
 		sql  = sql.replace("#{spinbx}",String.valueOf(t.getSpinbx()));
 		sql  = sql.replace("#{spinby}",String.valueOf(t.getSpinby()));
 		sql  = sql.replace("#{spinbz}",String.valueOf(t.getSpinbz()));
 		sql  = sql.replace("#{spinbaa}",String.valueOf(t.getSpinbaa()));
 		sql  = sql.replace("#{spinbab}",String.valueOf(t.getSpinbab()));
 		sql  = sql.replace("#{spinbac}",String.valueOf(t.getSpinbac()));
 		sql  = sql.replace("#{spinbad}",String.valueOf(t.getSpinbad()));
 		sql  = sql.replace("#{spinbae}",String.valueOf(t.getSpinbae()));
 		sql  = sql.replace("#{spinbaf}",String.valueOf(t.getSpinbaf()));
 		sql  = sql.replace("#{spinbag}",String.valueOf(t.getSpinbag()));
 		sql  = sql.replace("#{spinbah}",String.valueOf(t.getSpinbah()));
 		sql  = sql.replace("#{spinbai}",String.valueOf(t.getSpinbai()));
 		sql  = sql.replace("#{spince}",String.valueOf(t.getSpince()));
 		sql  = sql.replace("#{spincf}",String.valueOf(t.getSpincf()));
 		sql  = sql.replace("#{spincg}",String.valueOf(t.getSpincg()));
 		sql  = sql.replace("#{spinch}",String.valueOf(t.getSpinch()));
 		sql  = sql.replace("#{spinci}",String.valueOf(t.getSpinci()));
 		sql  = sql.replace("#{spincj}",String.valueOf(t.getSpincj()));
 		sql  = sql.replace("#{spinck}",String.valueOf(t.getSpinck()));
 		sql  = sql.replace("#{spincl}",String.valueOf(t.getSpincl()));
 		sql  = sql.replace("#{spincm}",String.valueOf(t.getSpincm()));
 		sql  = sql.replace("#{spincn}",String.valueOf(t.getSpincn()));
 		sql  = sql.replace("#{spinco}",String.valueOf(t.getSpinco()));
 		sql  = sql.replace("#{spincp}",String.valueOf(t.getSpincp()));
 		sql  = sql.replace("#{spincq}",String.valueOf(t.getSpincq()));
 		sql  = sql.replace("#{spincr}",String.valueOf(t.getSpincr()));
 		sql  = sql.replace("#{spincs}",String.valueOf(t.getSpincs()));
 		sql  = sql.replace("#{spinct}",String.valueOf(t.getSpinct()));
 		sql  = sql.replace("#{spincu}",String.valueOf(t.getSpincu()));
 		sql  = sql.replace("#{spincv}",String.valueOf(t.getSpincv()));
 		sql  = sql.replace("#{spincw}",String.valueOf(t.getSpincw()));
 		sql  = sql.replace("#{spincx}",String.valueOf(t.getSpincx()));
 		sql  = sql.replace("#{spincy}",String.valueOf(t.getSpincy()));
 		sql  = sql.replace("#{spincz}",String.valueOf(t.getSpincz()));
 		sql  = sql.replace("#{spincaa}",String.valueOf(t.getSpincaa()));
 		sql  = sql.replace("#{spincab}",String.valueOf(t.getSpincab()));
 		sql  = sql.replace("#{spincac}",String.valueOf(t.getSpincac()));
 		sql  = sql.replace("#{spincad}",String.valueOf(t.getSpincad()));
 		sql  = sql.replace("#{spincae}",String.valueOf(t.getSpincae()));
 		sql  = sql.replace("#{spincaf}",String.valueOf(t.getSpincaf()));
 		sql  = sql.replace("#{spincag}",String.valueOf(t.getSpincag()));
 		sql  = sql.replace("#{spincah}",String.valueOf(t.getSpincah()));
 		sql  = sql.replace("#{spincai}",String.valueOf(t.getSpincai()));
 		sql  = sql.replace("#{spincaj}",String.valueOf(t.getSpincaj()));
 		sql  = sql.replace("#{spincak}",String.valueOf(t.getSpincak()));
 		sql  = sql.replace("#{spincal}",String.valueOf(t.getSpincal()));
 		sql  = sql.replace("#{spincam}",String.valueOf(t.getSpincam()));
 		sql  = sql.replace("#{spincan}",String.valueOf(t.getSpincan()));
 		sql  = sql.replace("#{spincao}",String.valueOf(t.getSpincao()));
 		sql  = sql.replace("#{spincap}",String.valueOf(t.getSpincap()));
 		sql  = sql.replace("#{spincaq}",String.valueOf(t.getSpincaq()));
 		sql  = sql.replace("#{spincar}",String.valueOf(t.getSpincar()));
 		sql  = sql.replace("#{spincas}",String.valueOf(t.getSpincas()));
 		sql  = sql.replace("#{spincat}",String.valueOf(t.getSpincat()));
 		sql  = sql.replace("#{spindf}",String.valueOf(t.getSpindf()));
 		sql  = sql.replace("#{spindg}",String.valueOf(t.getSpindg()));
 		sql  = sql.replace("#{spindh}",String.valueOf(t.getSpindh()));
 		sql  = sql.replace("#{spindi}",String.valueOf(t.getSpindi()));
 		sql  = sql.replace("#{spindj}",String.valueOf(t.getSpindj()));
 		sql  = sql.replace("#{spindk}",String.valueOf(t.getSpindk()));
 		sql  = sql.replace("#{spindl}",String.valueOf(t.getSpindl()));
 		sql  = sql.replace("#{spindm}",String.valueOf(t.getSpindm()));
 		sql  = sql.replace("#{spindn}",String.valueOf(t.getSpindn()));
 		sql  = sql.replace("#{spindo}",String.valueOf(t.getSpindo()));
 		sql  = sql.replace("#{spindp}",String.valueOf(t.getSpindp()));
 		sql  = sql.replace("#{spindq}",String.valueOf(t.getSpindq()));
 		sql  = sql.replace("#{spindr}",String.valueOf(t.getSpindr()));
 		sql  = sql.replace("#{spinds}",String.valueOf(t.getSpinds()));
 		sql  = sql.replace("#{spindt}",String.valueOf(t.getSpindt()));
 		sql  = sql.replace("#{spindu}",String.valueOf(t.getSpindu()));
 		sql  = sql.replace("#{spindv}",String.valueOf(t.getSpindv()));
 		sql  = sql.replace("#{spindw}",String.valueOf(t.getSpindw()));
 		sql  = sql.replace("#{spindx}",String.valueOf(t.getSpindx()));
 		sql  = sql.replace("#{spindy}",String.valueOf(t.getSpindy()));
 		sql  = sql.replace("#{spindz}",String.valueOf(t.getSpindz()));
 		sql  = sql.replace("#{spindaa}",String.valueOf(t.getSpindaa()));
 		sql  = sql.replace("#{spindab}",String.valueOf(t.getSpindab()));
 		sql  = sql.replace("#{spindac}",String.valueOf(t.getSpindac()));
 		sql  = sql.replace("#{spinef}",String.valueOf(t.getSpinef()));
 		sql  = sql.replace("#{spineg}",String.valueOf(t.getSpineg()));
 		sql  = sql.replace("#{spineh}",String.valueOf(t.getSpineh()));
 		sql  = sql.replace("#{spinei}",String.valueOf(t.getSpinei()));
 		sql  = sql.replace("#{spinej}",String.valueOf(t.getSpinej()));
 		sql  = sql.replace("#{spinek}",String.valueOf(t.getSpinek()));
 		sql  = sql.replace("#{spinel}",String.valueOf(t.getSpinel()));
 		sql  = sql.replace("#{spinem}",String.valueOf(t.getSpinem()));
 		sql  = sql.replace("#{spinen}",String.valueOf(t.getSpinen()));
 		sql  = sql.replace("#{spineo}",String.valueOf(t.getSpineo()));
 		sql  = sql.replace("#{spinep}",String.valueOf(t.getSpinep()));
 		sql  = sql.replace("#{spineq}",String.valueOf(t.getSpineq()));
 		sql  = sql.replace("#{spiner}",String.valueOf(t.getSpiner()));
 		sql  = sql.replace("#{spines}",String.valueOf(t.getSpines()));
 		sql  = sql.replace("#{spinet}",String.valueOf(t.getSpinet()));
 		sql  = sql.replace("#{spineu}",String.valueOf(t.getSpineu()));
 		sql  = sql.replace("#{spinev}",String.valueOf(t.getSpinev()));
 		sql  = sql.replace("#{spinew}",String.valueOf(t.getSpinew()));
 		sql  = sql.replace("#{spinex}",String.valueOf(t.getSpinex()));
 		sql  = sql.replace("#{spiney}",String.valueOf(t.getSpiney()));
 		sql  = sql.replace("#{spinez}",String.valueOf(t.getSpinez()));
 		sql  = sql.replace("#{spineaa}",String.valueOf(t.getSpineaa()));
 		sql  = sql.replace("#{spineab}",String.valueOf(t.getSpineab()));
 		sql  = sql.replace("#{spineac}",String.valueOf(t.getSpineac()));
 		sql  = sql.replace("#{spinead}",String.valueOf(t.getSpinead()));
 		sql  = sql.replace("#{spineae}",String.valueOf(t.getSpineae()));
 		sql  = sql.replace("#{spineaf}",String.valueOf(t.getSpineaf()));
 		sql  = sql.replace("#{spineag}",String.valueOf(t.getSpineag()));
 		sql  = sql.replace("#{spineah}",String.valueOf(t.getSpineah()));
 		sql  = sql.replace("#{spineai}",String.valueOf(t.getSpineai()));
 		sql  = sql.replace("#{spineaj}",String.valueOf(t.getSpineaj()));
 		sql  = sql.replace("#{spineak}",String.valueOf(t.getSpineak()));
 		sql  = sql.replace("#{spineal}",String.valueOf(t.getSpineal()));
 		sql  = sql.replace("#{spineam}",String.valueOf(t.getSpineam()));
 		sql  = sql.replace("#{spinean}",String.valueOf(t.getSpinean()));
 		sql  = sql.replace("#{spineao}",String.valueOf(t.getSpineao()));
 		sql  = sql.replace("#{spineap}",String.valueOf(t.getSpineap()));
 		sql  = sql.replace("#{spineaq}",String.valueOf(t.getSpineaq()));
 		sql  = sql.replace("#{spinear}",String.valueOf(t.getSpinear()));
 		sql  = sql.replace("#{spineas}",String.valueOf(t.getSpineas()));
 		sql  = sql.replace("#{spineat}",String.valueOf(t.getSpineat()));
 		sql  = sql.replace("#{spinff}",String.valueOf(t.getSpinff()));
 		sql  = sql.replace("#{spinfg}",String.valueOf(t.getSpinfg()));
 		sql  = sql.replace("#{spinfh}",String.valueOf(t.getSpinfh()));
 		sql  = sql.replace("#{spinfi}",String.valueOf(t.getSpinfi()));
 		sql  = sql.replace("#{spinfj}",String.valueOf(t.getSpinfj()));
 		sql  = sql.replace("#{spinfk}",String.valueOf(t.getSpinfk()));
 		sql  = sql.replace("#{spinfl}",String.valueOf(t.getSpinfl()));
 		sql  = sql.replace("#{spinfm}",String.valueOf(t.getSpinfm()));
 		sql  = sql.replace("#{spinfn}",String.valueOf(t.getSpinfn()));
 		sql  = sql.replace("#{spinfo}",String.valueOf(t.getSpinfo()));
 		sql  = sql.replace("#{spinfp}",String.valueOf(t.getSpinfp()));
 		sql  = sql.replace("#{spinfq}",String.valueOf(t.getSpinfq()));
 		sql  = sql.replace("#{spinfr}",String.valueOf(t.getSpinfr()));
 		sql  = sql.replace("#{spinfs}",String.valueOf(t.getSpinfs()));
 		sql  = sql.replace("#{spinft}",String.valueOf(t.getSpinft()));
 		sql  = sql.replace("#{spinfu}",String.valueOf(t.getSpinfu()));
 		sql  = sql.replace("#{spinfv}",String.valueOf(t.getSpinfv()));
 		sql  = sql.replace("#{spinfw}",String.valueOf(t.getSpinfw()));
 		sql  = sql.replace("#{spinfx}",String.valueOf(t.getSpinfx()));
 		sql  = sql.replace("#{spinfy}",String.valueOf(t.getSpinfy()));
 		sql  = sql.replace("#{spinfz}",String.valueOf(t.getSpinfz()));
 		sql  = sql.replace("#{spinfaa}",String.valueOf(t.getSpinfaa()));
 		sql  = sql.replace("#{spinfab}",String.valueOf(t.getSpinfab()));
 		sql  = sql.replace("#{spinfac}",String.valueOf(t.getSpinfac()));
 		sql  = sql.replace("#{spingf}",String.valueOf(t.getSpingf()));
 		sql  = sql.replace("#{spingg}",String.valueOf(t.getSpingg()));
 		sql  = sql.replace("#{spingh}",String.valueOf(t.getSpingh()));
 		sql  = sql.replace("#{spingi}",String.valueOf(t.getSpingi()));
 		sql  = sql.replace("#{spingj}",String.valueOf(t.getSpingj()));
 		sql  = sql.replace("#{spingk}",String.valueOf(t.getSpingk()));
 		sql  = sql.replace("#{spingl}",String.valueOf(t.getSpingl()));
 		sql  = sql.replace("#{spingm}",String.valueOf(t.getSpingm()));
 		sql  = sql.replace("#{spingn}",String.valueOf(t.getSpingn()));
 		sql  = sql.replace("#{spingo}",String.valueOf(t.getSpingo()));
 		sql  = sql.replace("#{spingp}",String.valueOf(t.getSpingp()));
 		sql  = sql.replace("#{spingq}",String.valueOf(t.getSpingq()));
 		sql  = sql.replace("#{spingr}",String.valueOf(t.getSpingr()));
 		sql  = sql.replace("#{spings}",String.valueOf(t.getSpings()));
 		sql  = sql.replace("#{spingt}",String.valueOf(t.getSpingt()));
 		sql  = sql.replace("#{spingu}",String.valueOf(t.getSpingu()));
 		sql  = sql.replace("#{spingv}",String.valueOf(t.getSpingv()));
 		sql  = sql.replace("#{spingw}",String.valueOf(t.getSpingw()));
 		sql  = sql.replace("#{spinhe}",String.valueOf(t.getSpinhe()));
 		sql  = sql.replace("#{spinhf}",String.valueOf(t.getSpinhf()));
 		sql  = sql.replace("#{spinhg}",String.valueOf(t.getSpinhg()));
 		sql  = sql.replace("#{spinhh}",String.valueOf(t.getSpinhh()));
 		sql  = sql.replace("#{spinhi}",String.valueOf(t.getSpinhi()));
 		sql  = sql.replace("#{spinhj}",String.valueOf(t.getSpinhj()));
 		sql  = sql.replace("#{spinhk}",String.valueOf(t.getSpinhk()));
 		sql  = sql.replace("#{spinhl}",String.valueOf(t.getSpinhl()));
 		sql  = sql.replace("#{spinhm}",String.valueOf(t.getSpinhm()));
 		sql  = sql.replace("#{spinhn}",String.valueOf(t.getSpinhn()));
 		sql  = sql.replace("#{spinho}",String.valueOf(t.getSpinho()));
 		sql  = sql.replace("#{spinhp}",String.valueOf(t.getSpinhp()));
 		sql  = sql.replace("#{spinhq}",String.valueOf(t.getSpinhq()));
 		sql  = sql.replace("#{spinhr}",String.valueOf(t.getSpinhr()));
 		sql  = sql.replace("#{spinhs}",String.valueOf(t.getSpinhs()));
 		sql  = sql.replace("#{spinht}",String.valueOf(t.getSpinht()));
 		sql  = sql.replace("#{spinhu}",String.valueOf(t.getSpinhu()));
 		sql  = sql.replace("#{spinhv}",String.valueOf(t.getSpinhv()));
 		sql  = sql.replace("#{spinhw}",String.valueOf(t.getSpinhw()));
 		sql  = sql.replace("#{spinhx}",String.valueOf(t.getSpinhx()));
 		sql  = sql.replace("#{spinhy}",String.valueOf(t.getSpinhy()));
 		sql  = sql.replace("#{spinhz}",String.valueOf(t.getSpinhz()));
 		sql  = sql.replace("#{spinhaa}",String.valueOf(t.getSpinhaa()));
 		sql  = sql.replace("#{spinhab}",String.valueOf(t.getSpinhab()));
 		sql  = sql.replace("#{spinhac}",String.valueOf(t.getSpinhac()));
 		sql  = sql.replace("#{spinhad}",String.valueOf(t.getSpinhad()));
 		sql  = sql.replace("#{spinhae}",String.valueOf(t.getSpinhae()));
 		sql  = sql.replace("#{spinhaf}",String.valueOf(t.getSpinhaf()));
        sql  = sql.replace("#{mllx}",String.valueOf(t.getMllx()));
        sql  = sql.replace("#{ccdw}",String.valueOf(t.getCcdw()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
 	
 	/**
	 * 执行JAVA增强
	 */
 	private void executeJavaExtend(String cgJavaType,String cgJavaValue,Map<String,Object> data) throws Exception {
 		if(StringUtil.isNotEmpty(cgJavaValue)){
			Object obj = null;
			try {
				if("class".equals(cgJavaType)){
					//因新增时已经校验了实例化是否可以成功，所以这块就不需要再做一次判断
					obj = MyClassLoader.getClassByScn(cgJavaValue).newInstance();
				}else if("spring".equals(cgJavaType)){
					obj = ApplicationContextUtil.getContext().getBean(cgJavaValue);
				}
				if(obj instanceof CgformEnhanceJavaInter){
					CgformEnhanceJavaInter javaInter = (CgformEnhanceJavaInter) obj;
					javaInter.execute("bd_spin",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}