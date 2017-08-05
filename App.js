import React, {Component} from 'react';
import { StyleSheet, Text, View } from 'react-native';

export default class App extends React.Component {
  render() {
    return (
      <View style={styles.app}>
        <NavBar />
        <User />
        <View style={{height:40}}></View>
        <ButtonGroup />
        <View style={{flex:1}}></View>
        <Tabs />
      </View>
    );
  }
}

class NavBar extends Component {
  render() {
    return (
      <View style={{height:60, alignItems:'center', justifyContent:'center'}}>
        <Text>더보기</Text>
      </View>
    );
  }
}
class User extends Component {
  render() {
    return (
      <View style={{height: 200, flexDirection:'column', backgroundColor:'red'}}>
        <View style={{height: 150, flexDirection:'row'}}>
          <View style={{width:100}}>
            <View style={{width:100, height:100}}></View>
          </View>
          <View style={{flex:1}}>
            <Text>aa</Text>
            <Text>bb</Text>
            <Text>cc</Text>
          </View>
        </View>
        <View style={{height: 50, flexDirection:'row'}}>
          <View style={{flex:1}}><Text>뚫뚤</Text></View>
          <View style={{flex:1}}><Text>메롱</Text></View>
          <View style={{flex:1}}><Text>하하</Text></View>
        </View>
      </View>
    );
  }
}

class Button extends Component {
  render() {
    return (
      <View style={{flex: 1, height: 100, borderWidth: 0.5, justifyContent: 'center', alignItems: 'center'}}>
        <View style={{width:50, height:50, backgroundColor:'gray'}}></View>
        <Text>{this.props.name}</Text>
      </View>
    );
  }
}


class ButtonGroup extends Component {
  render() {
    return (
      <View style={{height:300, flex:1, flexDirection:'column', backgroundColor:'green'}}>
        <View style={{flex:1, flexDirection:'row'}}>
          <Button name="내 계정" />
          <Button name="친구" />
          <Button name="강의평가" />
          <Button name="학점계산기" />
        </View>
        <View style={{flex:1, flexDirection:'row'}}>
          <Button name="쪽지함" />
          <Button name="공지사항" />
          <Button name="도움말" />
          <Button name="앱 설정" />
        </View>
      </View>
    );
  }
}
class Tabs extends Component {
  render() {
    return (
      <View style={{height: 100, flexDirection:'row', backgroundColor:'yellow'}}>
        <View style={{flex:1}}><Text>홈</Text></View>
        <View style={{flex:1}}><Text>시간표</Text></View>
        <View style={{flex:1}}><Text>커뮤니티</Text></View>
        <View style={{flex:1}}><Text>모임</Text></View>
        <View style={{flex:1}}><Text>더보기</Text></View>
      </View>
    );
  }
}



const styles = StyleSheet.create({
  app: {
    flex: 1,
    flexDirection: 'column'
  },
  container: {
    flex: 1,
    flexDirection: 'row'
  },
  left: {
    flex: 1,
    backgroundColor: 'red'
  },
  right: {
    flex: 1,
    flexDirection: 'column'
  },
  top: {
    flex: 1,
    backgroundColor: 'blue'
  },
  bottom: {
    flex: 2,
    backgroundColor: 'green'
  },
  navBar: {
    height: 50,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: 'green'
  },
});
